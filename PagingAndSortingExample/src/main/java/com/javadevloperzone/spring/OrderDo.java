package com.javadevloperzone.spring;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDo {

	@Id
	@GeneratedValue
	private Long orderId;

	private String orderedBy;

	private Date orderAt;

	private String orderedItem;

	private String deliveryAdress;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public Date getOrderAt() {
		return orderAt;
	}

	public void setOrderAt(Date orderAt) {
		this.orderAt = orderAt;
	}

	public String getOrderedItem() {
		return orderedItem;
	}

	public void setOrderedItem(String orderedItem) {
		this.orderedItem = orderedItem;
	}

	public String getDeliveryAdress() {
		return deliveryAdress;
	}

	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}

	@Override
	public String toString() {
		return "OrderDo [orderId=" + orderId + ", orderedBy=" + orderedBy + ", orderAt=" + orderAt + ", orderedItem="
				+ orderedItem + ", deliveryAdress=" + deliveryAdress + "]";
	}

}
