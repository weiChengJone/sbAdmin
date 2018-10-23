package com.bypay.dao;


import com.bypay.domian.HxUserSuppinfo;

import java.util.ArrayList;

public interface HxUserSuppinfoDao{
	/**
	 * 查询指定编号的用户补充信息
	 * @param hus
	 * @return
	 */
	HxUserSuppinfo selectHxUserSuppinfoOne(HxUserSuppinfo hus);
	/**
	 * 修改用户状态
	 * @return
	 */
	int updateHxUserSuppinfo(HxUserSuppinfo hus);
	
	int updateHxUserSuppinfoBatch(ArrayList<HxUserSuppinfo> updateList);
}
