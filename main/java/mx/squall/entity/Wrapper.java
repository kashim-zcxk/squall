package mx.squall.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Wrapper {

	private String transactionId = UUID.randomUUID().toString().replace("-", "");
	private Boolean status;
	private List<ErrorWrapper> error;
	private Object data;

	public Wrapper(Boolean status, ArrayList<ErrorWrapper> error, Object data) {
		super();
		this.status = status;
		this.error = error;
		this.data = data;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<ErrorWrapper> getError() {
		return error;
	}

	public void setError(List<ErrorWrapper> error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
