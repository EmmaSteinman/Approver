package approver;

public class SoapApproverService extends SoapApproverServiceSkeleton {
	
	public approver.Rate approveOperation(approver.Proposal proposal) 
	{
		PropType prop = proposal.getProposal();
		String name = prop.getName();
		String address = prop.getAddress();
		float amount = prop.getAmount();
		float rateAmount;
		approver.Rate rate = new approver.Rate();
		
		if (name.startsWith("Emma")) rateAmount = 1f;
		else if (address.startsWith("1762")) rateAmount = 2f;
		else if (amount >= 10) rateAmount= 3f;
		else rateAmount = 10f;
		
		rate.setRate(rateAmount);
		return rate;
	}
}
