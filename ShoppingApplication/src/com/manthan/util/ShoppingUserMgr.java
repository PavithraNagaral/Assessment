package com.manthan.util;

import com.manthan.shoppingapplication.dao.UserInfoDao;
import com.manthan.shoppingapplication.dao.UserInfoDaoImp;

public class ShoppingUserMgr {
	private ShoppingUserMgr() {
		//constructor can be private we are not allowing anybody to make obj of it.
	}
	public static UserInfoDao getDaoInstance() {
		return new UserInfoDaoImp();
	}

}
