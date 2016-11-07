package com.epam.yops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;





@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(YopsApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(
				new Object[] { Application.class }, args);
		//ShippingDetailService bean=(ShippingDetailService) context.getBean(ShippingDetailService.class);
		
		// bean.create(ShippingDetailData.getData());
		  //ShippingDetail shippingDetails1=(ShippingDetail) bean.findByShippingId("100");
		  
		  //System.out.println("shippingDetails "+shippingDetails1.getFullName());
		 
		 /*ShippingDetail shippingDetails=(ShippingDetail) bean.findByZip("500072");
	System.out.println("shippingDetails "+shippingDetails.getCity());*/
	}
}
