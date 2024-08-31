import java.util.HashMap;
import java.util.Map;

public class EmployeeSearchImpl {
	// TODO: STUDY THESE METHODS CAREFULLY, YOU MAY LIKE TO USE THOSE
	private static Map<Integer, Employee> employeeRegistry = new HashMap<>();

	public boolean isRegistryEmpty() {
		return employeeRegistry.isEmpty();
	}

	public void add(Employee employee) {
		employeeRegistry.put(employee.getId(), employee);
	}

	public Employee fetchById(Integer id) {
		return employeeRegistry.get(id);
	}

	public void printReportingStructure(int empId) {
		Employee e = null;
		// TODO: obtain valid employee object for given empId and assign

		e = fetchById(empId);

		System.out.println(e.reportingStructure());
	}
}
