import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import com.customer.jpa.CustomerApplication;
import com.customer.jpa.controller.CustomerController;
import com.customer.jpa.domain.CustomerDetails;
import com.customer.jpa.repository.CustomerRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ContextConfiguration(classes = { CustomerApplication.class })
class CustomerApplicationTests {
    //final String URL = "http://localhost:3000";
final String URL = "#BASE_URL#";
    
    @Autowired
	CustomerRepository customerRepository;

	@Test
	@Order(1)
	public void testAppAnnotation() {
		try {
			assertTrue(checkAnnotations(CustomerApplication.class, "SpringBootApplication"));
		} catch (Exception e) {
			fail("Unable to find the SpringBootApplication annotation in CustomerApplication class " + e.toString());
		}
	}

	@Test
	@Order(2)
	public void testControllerAnnotation() {
		try {
			assertTrue(checkAnnotations(CustomerController.class, "RestController"));
		} catch (Exception e) {
			fail("Unable to find the RestController annotation in Controller class " + e.toString());
		}
	}

	@Test
	@Order(3)
	public void testCustomerGet() throws URISyntaxException, JSONException {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		URI uri = new URI(URL + "/customer/details/3");
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		assertEquals(200, result.getStatusCodeValue());
		JSONObject responseObject = new JSONObject(result.getBody());
		if(!responseObject.get("firstName").equals("Manisha")) {
			fail("Unable to fetch Customer first name " + responseObject.get("firstName"));
		}
	}

	@Test
	@Order(4)
	public void testCustomerCreate() throws URISyntaxException, JSONException {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		URI uri = new URI(URL + "/customer/details");
		CustomerDetails customer = new CustomerDetails("Adam","Schiff","Europe","9822929374");
		ResponseEntity<String> result = restTemplate.postForEntity(uri, customer, String.class);
		assertEquals(200, result.getStatusCodeValue());
		JSONObject responseObject = new JSONObject(result.getBody());
		if(!responseObject.get("address").equals("Europe")) {
			fail("Unable to fetch address " + responseObject.get("address"));
		}
	}

	@Test
	@Order(5)
	public void testCustomerUpdate() throws URISyntaxException, JSONException {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		URI uri = new URI(URL + "/customer/details");
		CustomerDetails customer = new CustomerDetails( 6L,"Adam","Smith","Australia","9090987690");
		HttpEntity<CustomerDetails> entity = new HttpEntity<CustomerDetails>(customer);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, entity, String.class);
		assertEquals(200, result.getStatusCodeValue());
		JSONObject responseObject = new JSONObject(result.getBody());
		if(!responseObject.get("lastName").equals("Smith")) {
			fail("Unable to fetch lastName " + responseObject.get("lastName"));
		}
	}

	@Test
	@Order(6)
	public void testCustomerDelete() throws URISyntaxException, JSONException {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		URI uri = new URI(URL + "/customer/details/2");
		ResponseEntity<Boolean> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, Boolean.class);
		assertEquals(200, result.getStatusCodeValue());
		assertTrue(result.getBody());
	}

	@Test
	@Order(7)
	public void testCustomerList() throws URISyntaxException, JSONException {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		URI uri = new URI(URL + "/customer/details");
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		assertEquals(200, result.getStatusCodeValue());
		JSONArray responseArray = new JSONArray(result.getBody());
		JSONObject responseObject = responseArray.getJSONObject(0);
		if(!responseObject.get("firstName").equals("Emma") || !responseObject.get("lastName").equals("Watson")) {
			fail("Unable to fetch Customer firstName " + responseObject.get("firstName"));
		}
	}

	@Test
	@Order(8)
	public void testJpa() throws URISyntaxException, JSONException {
		List<CustomerDetails> customer = (List<CustomerDetails>) customerRepository.findAll();
		List<String> customernames = new ArrayList<String>();
		customer.forEach(obj -> {
			customernames.add(obj.getFirstName());
		});
		assertTrue(customernames.contains("Emma"));
		assertTrue(customernames.contains("Manisha"));
		
	}
	
	public Boolean checkAnnotations(Class<?> myClass, String name) {
		Annotation[] annotations = myClass.getAnnotations();
		for (Annotation a : annotations) {
			if (a.toString().contains(name)) {
				return true;
			}
		}
		return false;
	}

}