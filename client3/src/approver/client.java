package approver;

import approver.ApproverServiceStub.ApproveOperation;
import approver.ApproverServiceStub.ApproveOperationResponse;

public class client {

	public static void main(String[] args) throws Exception {
		
		ApproverServiceStub stub = new ApproverServiceStub();
		ApproverServiceStub.ApproveOperation request = new ApproverServiceStub.ApproveOperation();
		
		request.setName("Eliza");
		request.setAmount(30);
		ApproveOperationResponse resp = stub.approveOperation(request);
		
		System.out.println("Response : " + resp.getValue());
	}
	
}
