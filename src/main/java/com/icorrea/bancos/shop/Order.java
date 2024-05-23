package com.icorrea.bancos.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;



//@Data
//@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Document
public class Order {

	private String id;
	private String customerId;
	private Date orderDate;
	private List<LineItem> items;
	
	public Order(String customerId, Date orderDate, List<LineItem> items) {
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.items = items;
	}

	/**
	 * Creates a new {@link Order} for the given customer id and order date.
	 *
	 * @param customerId
	 * @param orderDate
	 */
	public Order(String customerId, Date orderDate) {
		this(customerId, orderDate, new ArrayList<>());
	}

	public Order(String customerId, Date orderDate, ArrayList items) {
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.items = items;
	}

	/**
	 * Adds a {@link LineItem} to the {@link Order}.
	 *
	 * @param item
	 * @return
	 */
	public Order addItem(LineItem item) {

		this.items.add(item);
		return this;
	}
}

