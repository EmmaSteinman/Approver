package approver;

//import approver.SoapApproverServiceStub.Rate;
//import approver.SoapApproverServiceStub.PropType;

public class SoapClient {

	public static void main(String[] args) throws Exception {
		
		SoapApproverServiceStub stub = new SoapApproverServiceStub();
		SoapApproverServiceStub.Proposal proposal = new SoapApproverServiceStub.Proposal();
		SoapApproverServiceStub.PropType request = new SoapApproverServiceStub.PropType();
		
		request.setName("Emma");
		request.setAmount(3);
		request.setAddress("2000 Mend");
		proposal.setProposal(request);
		SoapApproverServiceStub.Rate resp = stub.approveOperation(proposal);
		
		System.out.println("Response : " + resp.getRate());
	}
	
}
