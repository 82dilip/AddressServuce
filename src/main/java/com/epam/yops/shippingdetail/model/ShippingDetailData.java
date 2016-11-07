package com.epam.yops.shippingdetail.model;

public class ShippingDetailData {

	public static ShippingDetail getData()
	{
		ShippingDetail shippingDetail = new ShippingDetail();
		//ObjectId id1 = new ObjectId();
	
		//shippingDetail.setId(id1);
		shippingDetail.setShippingId("100");
		shippingDetail.setFullName("Kishore");
		shippingDetail.setAddrLine1("1");
		shippingDetail.setAddrLine2("addr2");
		shippingDetail.setState("TS");
		shippingDetail.setCity("Hyd");
		shippingDetail.setCountry("India");
		shippingDetail.setZip("500072");
		shippingDetail.setPhNumber("900000012");
		return shippingDetail;
	}
}
