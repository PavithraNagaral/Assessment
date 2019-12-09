package com.manthan.hotelapplication.dao;

import java.sql.ResultSet;

import com.manthan.hotelapllication.bean.HotelApplicationBean;

public interface HotelApplicationDao {
	

	 public boolean additem(HotelApplicationBean hotelApllicationbean);
	 public boolean deleteitem(int item_code);
	 public boolean updateitem(int item_code,String food_name);
	 public ResultSet seeAllitems();
	 public void totalbill();


}
