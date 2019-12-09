package com.manthan.shoppingapplication.dao;

import com.manthan.shoppingappliction.bean.UserInfoBean;

public interface UserInfoDao {
	
	 public boolean register(UserInfoBean userInfoBean);
	 public  UserInfoBean authenticate(String email,String password);

}
