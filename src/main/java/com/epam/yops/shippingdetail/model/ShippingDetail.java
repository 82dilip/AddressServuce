package com.epam.yops.shippingdetail.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * Class ShippingDetail
 *
 */

@Document(collection = "ShippingDetail")
public class ShippingDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8098813394800137876L;

	private String id;
	private String shippingId;
	private String fullName;
	private String addrLine1;
	private String addrLine2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String phNumber;

	public String getId() {
		return id.toString();
	}

	public void setId(String id) {
		if (!id.isEmpty())
			this.id = id;
		else
			this.id = UUID.randomUUID().toString();

	}

	public String getShippingId() {
		return shippingId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

}
