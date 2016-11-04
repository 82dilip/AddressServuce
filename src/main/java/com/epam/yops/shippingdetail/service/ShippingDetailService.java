package com.epam.yops.shippingdetail.service;

import java.io.Serializable;
import java.util.Collection;



import com.epam.yops.shippingdetail.model.ShippingDetail;

public interface ShippingDetailService {

	/**
	 * Insert the profileDetails data into the database
	 * 
	 * @param profileDetails
	 */
	void create(ShippingDetail shippingDetail);


	/**
	 * Retrieve the shippingDetail data
	 * 
	 * @return shippingDetail object as List
	 */
	
	
	public abstract ShippingDetail findByShippingId(String shippingId);
	
	public abstract ShippingDetail findByZip(String zip);


	

}
