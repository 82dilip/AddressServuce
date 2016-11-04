package com.epam.yops.shippingdetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.yops.shippingdetail.model.ShippingDetail;
import com.epam.yops.shippingdetail.service.ShippingDetailService;



@Controller
public class ShippingDetailController {
	@Autowired
	ShippingDetailService shippingDetailService;
	
	ShippingDetail shippingDetails;

	@RequestMapping(value = "/shippingDetails", method = RequestMethod.GET)
	public @ResponseBody String getShippingDetails(@RequestParam String shippingId) {
		System.out.println("Testing Shipping Details 1 2 3 ....");
		System.out.println(shippingId);
		
	  //  shippingDetailService.create(ShippingDetailData.getData());
		if(shippingId==null || shippingId.length()==0 || shippingId.isEmpty()){
		shippingDetails=(ShippingDetail) shippingDetailService.findByShippingId("100");
		}else{
			shippingDetails=(ShippingDetail) shippingDetailService.findByShippingId(shippingId);
		}
		System.out.println("Testing Shipping Details 1 2 3 .... data saved successfully"+shippingDetails.getFullName());
		
		StringBuffer sb=new StringBuffer();
		sb.append("SHIPPING DETAILS :").append("\n").append("Full Name :"+shippingDetails.getFullName())
		.append("\n Address1 : "+shippingDetails.getAddrLine1())
		.append("\n Address2 : "+shippingDetails.getAddrLine2())
		.append("\n City : "+shippingDetails.getCity())
		.append("\n State : "+shippingDetails.getState())
		.append("\n Country : "+shippingDetails.getCountry())
		.append("\n Zip : "+shippingDetails.getZip())
		.append("\n Phone Number : "+shippingDetails.getPhNumber());
		return sb.toString();
	}

}
