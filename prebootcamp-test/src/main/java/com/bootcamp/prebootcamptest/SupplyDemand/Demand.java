package com.bootcamp.prebootcamptest.SupplyDemand;

public class Demand {
	
	private String productId;
	private Double quantity;
	
	
	public Demand(String productId, Double quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}
	
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

	@Override
	public String toString() {
		return "Supply [productId=" + productId + ", quantity=" + quantity + "]";
	}
}
