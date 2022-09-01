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
	@Column(name = "totalPrice", nullable = true)
	private String totalPrice;
	@Column(name = "quantity", nullable = true)
	private String quantity;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long productId, long userId, String totalPrice, String quantity) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.totalPrice = totalPrice;
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

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", userId=" + userId + ", totalPrice="
				+ totalPrice + ", quantity=" + quantity + "]";
	}

	

}
