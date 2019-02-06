package chain.request;

public class Request {

	private RequestType requestType;
	private double amount;

	public Request(RequestType requestType, double amount) {
		super();
		this.requestType = requestType;
		this.amount = amount;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public double getAmount() {
		return amount;
	}

}
