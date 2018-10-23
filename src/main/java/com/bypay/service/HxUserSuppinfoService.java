package com.bypay.service;


import com.bypay.domian.HxUserSuppinfo;

import java.util.ArrayList;

public interface HxUserSuppinfoService {
	/**
	 * 查询指定编号的用户补充信息
	 * @param hu
	 * @return
	 */
	HxUserSuppinfo selectHxUserSuppinfoOne(HxUserSuppinfo hus);
	/**
	 * 修改用户状态
	 * @return
	 */
	int updateHxUserSuppinfo(HxUserSuppinfo hus);
	/**
	 * 记录用户状态
	 * @param updateList
	 * @return
	 */
	int updateHxUserSuppinfoBatch(ArrayList<HxUserSuppinfo> updateList);
}
