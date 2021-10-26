package com.bootcamp.prebootcamptest.SupplyDemand;

public class ReqResPojo {
	
	 String productId;
	 Double quantity;
	int Availability;
	
	//generating getters setters and 
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public int getAvailability() {
		return Availability;
	}
	public void setAvailability(int availability) {
		Availability = availability;
	}
	
	public ReqResPojo(String productId, Double quantity, int availability) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		Availability = availability;
	}
	@Override
	public String toString() {
		return "ReqResPojo [productId=" + productId + ", quantity=" + quantity + ", Availability=" + Availability + "]";
	}
	
	
}



