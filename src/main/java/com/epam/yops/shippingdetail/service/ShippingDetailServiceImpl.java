package com.epam.yops.shippingdetail.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.yops.shippingdetail.model.ShippingDetail;
import com.epam.yops.shippingdetails.dao.ShippingDetailRepository;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

@Service
public class ShippingDetailServiceImpl implements ShippingDetailService {

	@Autowired
	ShippingDetailRepository shippingDetailRepository;
	
	@Override
	public void create(ShippingDetail shippingDetail) {
		shippingDetailRepository.save(shippingDetail);
	}

	@Override
	public ShippingDetail findByShippingId(String shippingId) {
    
		 return (ShippingDetail) shippingDetailRepository.findByShippingId(shippingId);
		
	}
	
	@Override
	public ShippingDetail findByZip(String zip) {

		return (ShippingDetail) shippingDetailRepository.findByZip(zip);
		
	}

	@Override
	public String save(ShippingDetail details) {
		DBObject sDetails =  (DBObject) shippingDetailRepository.save(details);
		String id = sDetails.get("_id").toString();
		return id;
	}

}
