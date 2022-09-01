package com.appli.serverapi.model;

import javax.persistence.*;

@Entity
@Table(name = "product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "category")
	private String category;
	@Column(name = "price")
	private String price;
	@Column(name = "activated")
	private boolean activated;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String description, String category, String price, boolean activated) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.activated = activated;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", category="
				+ category + ", price=" + price + ", activated=" + activated + "]";
	}
	
	

}
