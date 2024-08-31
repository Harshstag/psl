import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int id;
	private Employee manager;
	private List<Employee> reportees = new ArrayList<>();

	public Employee(String name, int id, Employee manager) {
		this.name = name;
		this.id = id;
		this.manager = manager;
		// TODO: if this employee has valid manager,
		// TODO: then add this employee object to manager's reportees' collection
		// TODO: WRITE YOUR CODE BELOW THIS -------------
		if (manager != null) {
			manager.getReportees().add(this);
		}

		// TODO: WRITE YOUR CODE ABOVE THIS -------------
	}

	public String reportingStructure() {
		// TODO: RETURN REPORTING STRUCTURE AS A STRING FOR THIS EMPLOYEE
		// TODO: Its should be in form <employee> reports to <manager> reports to
		// <manager's manager> ... so on till top boss
		// TODO: e.g. for 'Rupa' it is : "Rupa reports to John reports to Amar reports
		// to Ramesh reports to Vinay"
		StringBuilder builder = new StringBuilder();
		// TODO: WRITE YOUR CODE BELOW THIS -------------

		Employee curr = this;

		while (curr != null) {
			if (builder.length() == 0) {
				builder.append(curr.getName());
			} else {
				builder.append(" reports to ");
				builder.append(curr.getName());
			}
			curr = curr.getManager();
		}

		// if (builder.length() == 0) {
		// builder.append(this.getName());
		// }

		// for (Employee repote : reportees) {
		// builder.insert(0, " reports to ");
		// builder.insert(0, repote.getName());

		// }

		// if (builder.length() == 0) {
		// builder.append(this.getName());
		// }

		// for (Employee repote : reportees) {
		// builder.append(" is reported by ");
		// builder.append(repote.getName());

		// }

		// TODO: WRITE YOUR CODE ABOVE THIS -------------
		return builder.toString();
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Employee getManager() {
		return manager;
	}

	public List<Employee> getReportees() {
		return reportees;
	}

}
