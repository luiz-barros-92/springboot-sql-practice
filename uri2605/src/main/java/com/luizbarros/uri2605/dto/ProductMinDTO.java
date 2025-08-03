package com.luizbarros.uri2605.dto;

import com.luizbarros.uri2605.projections.ProductProviderMinProjection;

public class ProductMinDTO {

	private String nameProduct;
	private String nameProvider;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(String nameProduct, String nameProvider) {
		this.nameProduct = nameProduct;
		this.nameProvider = nameProvider;
	}
	
	public ProductMinDTO(ProductProviderMinProjection projection) {
		nameProduct = projection.getNameProduct();
		nameProvider = projection.getNameProvider();
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public String getNameProvider() {
		return nameProvider;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [nameProduct=" + nameProduct + ", nameProvider=" + nameProvider + "]";
	}	
}
