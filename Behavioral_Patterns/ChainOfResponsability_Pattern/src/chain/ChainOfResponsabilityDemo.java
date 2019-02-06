package chain;

import chain.handler.CEO;
import chain.handler.Director;
import chain.handler.VP;
import chain.request.Request;
import chain.request.RequestType;

public class ChainOfResponsabilityDemo {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();

		director.setSuccessor(vp);
		vp.setSuccessor(ceo);

		Request conferenceRequest = new Request(RequestType.CONFERENCE, 500);
		Request purchaseRequest = new Request(RequestType.PURCHASE, 1000);
		Request hugePurchaseRequest = new Request(RequestType.PURCHASE, 5000);

		director.handleRequest(conferenceRequest);
		director.handleRequest(purchaseRequest);
		director.handleRequest(hugePurchaseRequest);
	}

}
