import java.util.*;
public class Policy{
    String policyId;
    String customerName;
    double policyValue;
    String policyPlan;
    double coveragePercentage;
    
    public Policy() {
    	super();
	}
    
    public Policy(String policyId,String customerName,double policyValue,String policyPlan,double coveragePercentage){
        super();
        this.policyId = policyId;
        this.customerName = customerName;
        this.policyValue = policyValue;
        this.policyPlan = policyPlan;
        this.coveragePercentage = coveragePercentage;
    }
    
    public String getPolicyId() {
    	return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
    
    public String getCustomerName() {
        return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
    public double getPolicyValue() {
        return policyValue;
    }

	public void setPolicyValue(double policyValue) {
		this.policyValue = policyValue;
	}
    
    public String getPolicyPlan() {
        return policyPlan;
    }

    public void setPolicyPlan(String policyPlan) {
		this.policyPlan = policyPlan;
	}
    
    public double getCoveragePercentage() {
        return coveragePercentage;
    }

    public void setCoveragePercentage(double coveragePercentage) {
		this.coveragePercentage = coveragePercentage;
	}
    

    public static  Map<String, List<Policy>> generatePolicyMap(Map<String, List<Policy>> policyMap, Policy policy) {
        // fill your code here

        String policyPlan = policy.getPolicyPlan();

        if(!policyMap.containsKey(policyPlan))
        {
            policyMap.putIfAbsent(policyPlan, new ArrayList<>());
        }
        policyMap.get(policyPlan).add(policy);
        return policyMap;
    }
    

    public static List<Policy> searchPolicy(Map<String, List<Policy>> policyMap, String policyPlan) {
        
        return policyMap.getOrDefault(policyPlan, new ArrayList<>());
    
    }
    
}