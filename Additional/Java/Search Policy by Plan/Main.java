
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        Map<String, List<Policy>> policyMap = new HashMap<>();
        
        System.out.println("Enter the number of policy");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the policy " + (i+ 1) + " detail");
            String[] details = sc.nextLine().split(",");

            Policy policy = new Policy(details[0], details[1], Double.parseDouble(details[2]), details[3],
                    Double.parseDouble(details[4]));
            Policy.generatePolicyMap(policyMap,policy);
        }

        System.out.println("Enter the policy plan to be searched");
        String policyPlanToSearch = sc.nextLine();

        List<Policy> resultPolicies = Policy.searchPolicy(policyMap, policyPlanToSearch);

        if (resultPolicies.isEmpty()) {
            System.out.println("Searched policy not found");
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Policy Id", "Customer Name", "Policy Value", "Policy plan", "Coverage Percentage");
            for (Policy policy : resultPolicies) {
                System.out.printf("%-15s %-15s %-15s %-15s %s\n", policy.getPolicyId(), policy.getCustomerName(), policy.getPolicyValue(), policy.getPolicyPlan(), policy.getCoveragePercentage());
            }
        }



        sc.close();

    }
}
