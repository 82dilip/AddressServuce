package com.epam.yops.shippingdetail.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.yops.shippingdetail.model.ShippingDetail;
import com.epam.yops.shippingdetail.service.ShippingDetailService;
import com.epam.yops.shippingdetails.dao.ShippingDetailRepository;

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

}
