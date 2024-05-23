package com.icorrea.bancos.customer;

import org.springframework.util.Assert;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Customer {

	private @Id @GeneratedValue Long id;
	private String firstname, lastname;

	private Address address;

	/**
	 * Creates a new {@link Customer} with the given firstname and lastname.
	 *
	 * @param firstname must not be {@literal null} or empty.
	 * @param lastname must not be {@literal null} or empty.
	 */
	public Customer(String firstname, String lastname) {

		Assert.hasText(firstname, "Firstname must not be null or empty!");
		Assert.hasText(lastname, "Lastname must not be null or empty!");

		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Customer(String firstname, String lastname, Address address) {

		Assert.hasText(firstname, "Firstname must not be null or empty!");
		Assert.hasText(lastname, "Lastname must not be null or empty!");
		Assert.notNull(address, "Address must not be null or empty!");

		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	// Required by JPA
	protected Customer() {}
}
