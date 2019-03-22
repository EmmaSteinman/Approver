package approver;

public class ApproverService extends ApproverServiceSkeleton {

	public approver.ApproveOperationResponse approveOperation(approver.ApproveOperation approveOperation)
	{
		String name = approveOperation.getName();
		String address = approveOperation.getAddress();
		float amount = approveOperation.getAmount();
		
		float rate;
		
		if (name.startsWith("Emma")) rate = 1f;
		else if (amount >= 10) rate = 3f;
		else rate = 15f;
		
		approver.ApproveOperationResponse resp = new approver.ApproveOperationResponse();
		resp.setValue(rate);
		
		
		return resp;
		
	}
}
