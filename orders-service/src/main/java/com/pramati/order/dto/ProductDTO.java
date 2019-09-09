package com.pramati.order.dto;

public class ProductDTO {

	private int availableQuantity;

	private double productPrice;

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setAvailableQuantity(int quantity) {
		this.availableQuantity = quantity;
	}
}
