package com.epam.yops.shippingdetails.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.epam.yops.shippingdetail.model.ShippingDetail;

public interface ShippingDetailRepository extends
CrudRepository<ShippingDetail, String> {
	
	public ShippingDetail findByShippingId(String shippingId);
	
	public ShippingDetail findByZip(String zip);

}
