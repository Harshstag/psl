
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	/**
	 * TODO: READ AND UNDERSTAND THE METHODS OF THESE CLASSES BEFORE YOU START
	 * CODING
	 * ---------------------------------------------------------------------------------------------------------------
	 * 
	 * GIVEN INFORMATION:
	 * FOLLOWING IS A SAMPLE HIERARCHY OF ORGANIZATION (name-id)
	 * YOU CAN REFER TO THIS EXAMPLE FOR SOLVING STATEMENT
	 * ----------------------------------------------------------------------
	 * Vinay-1 // name = Vinay, emp id =1
	 * -Suresh-11 // name = Suresh=sh, emp id =11
	 * -Seeta-111 // ... so on ...
	 * -Daya-1111
	 * -Darasingh-1112
	 * -Geeta-112
	 * -Ramesh-12
	 * -Amar-121
	 * -John1211
	 * -Rupa-12111
	 * -Deepa-12112
	 * -Akbar-122
	 * -Anthony-123
	 * 
	 */
	// GIVEN INFORMATION:
	// THIS IS INPUT IN FORM OF List of Strings. [each string is
	// "<name>,<id>,<managerId>"]
	// EACH ELEMENT OF LIST REPRESENTS DATA OF EMPLOYEE
	// OBSERVE FIRST EMPLOYEE BEING TOP-BOSS DOES NOT HAVE manager
	private static List<String> employeeData = Arrays.asList(
			"Vinay,1,", // e.g. Vinay is CEO as does not have a managerId
			"Suresh,11,1", // e.g. Suresh has empId=11 and reports to Vinay with empId =1
			"Seeta,111,11", // e.g. Seeta has empId=111 and reports to Suresh with empId =11
			"Geeta,112,11",
			"Daya,1111,111",
			"Darasingh,1112,111",
			"Ramesh,12,1",
			"Amar,121,12",
			"Akbar,122,12",
			"Anthony,123,12",
			"John,1211,121",
			"Rupa,12111,1211",
			"Deepa,12112,1211");

	public static void main(String[] args) throws NumberFormatException, IOException {
		EmployeeSearchImpl impl = new EmployeeSearchImpl();
		populateEmployees(impl);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter emp id for which reporting managers in series are required:");
		int testEmpId = Integer.parseInt(br.readLine());
		impl.printReportingStructure(testEmpId);
	}

	private static void populateEmployees(EmployeeSearchImpl impl) {
		for (String empData : employeeData) {
			// TODO: 1. Each 'empData' represents 'name', 'id', 'manager's id'
			// TODO: 2. create Employee object with following rule for manager
			// TODO: if managers id is not available, there is no manager (Employee is
			// top-most boss)
			// TODO: manager for that employee is 'null'
			// TODO: 3. if employeeRegistry is empty
			// TODO: then add first employee with manager as null. (Supposed to be Top-Boss)
			// TODO: else create Employee Object with appropriate Manager object assigned.
			// TODO: 4. add this newly created Employee Object to employeeRegistry.
			// TODO: ADD YOUR CODE BELOW THIS -----------------------------

			String[] detail = empData.split(",");

			String name = detail[0];
			int id = Integer.parseInt(detail[1]);
			Employee manager = null;

			if (!impl.isRegistryEmpty() || detail.length == 3) {
				int managerId = Integer.parseInt(detail[2]);
				manager = impl.fetchById(managerId);
			}

			impl.add(new Employee(name, id, manager));

			// TODO: ADD YOUR CODE ABOVE THIS -----------------------------
		}
	}
}
