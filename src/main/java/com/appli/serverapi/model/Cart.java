package com.appli.serverapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartId;
	@Column(name = "productId", nullable = true)
	private long productId;
	@Column(name = "userId", nullable = true)
	private long userId;
	@Column(name = "price", nullable = true)
	private long price;
	@Column(name = "quantity", nullable = true)
	private long quantity;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long productId, long userId, int price, int quantity) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*
	 * 
	 * Constructeur permettant d'utiliser la requette JPQL
	 * */
	public Cart(long productId, long price, long quantity) {
		super();
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getprice() {
		return price;
	}

	public void setprice(long price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", userId=" + userId + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

	

}
