   
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;
    
    import com.spring.dao.EventDAO;
    import com.spring.entity.Event;
    
    public class Main {
    
        public static void main(String[] args) throws NumberFormatException, IOException {
    		Logger log = Logger.getLogger("org.hibernate");
    		log.setLevel(Level.OFF);
    		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		 //Fill your code here
    	}
    
    }