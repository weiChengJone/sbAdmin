package com.bypay.service.impl;

import com.bypay.dao.HxUserSuppinfoDao;
import com.bypay.domian.HxUserSuppinfo;
import com.bypay.service.HxUserSuppinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("hxUserSuppinfoService")
public class HxUserSuppinfoServiceImpl implements HxUserSuppinfoService {

	@Autowired
	private HxUserSuppinfoDao hxUserSuppinfoDao;
	public HxUserSuppinfoDao getHxUserSuppinfoDao() {
		return hxUserSuppinfoDao;
	}
	public void setHxUserSuppinfoDao(HxUserSuppinfoDao hxUserSuppinfoDao) {
		this.hxUserSuppinfoDao = hxUserSuppinfoDao;
	}

	@Override
	public HxUserSuppinfo selectHxUserSuppinfoOne(HxUserSuppinfo hus) {
		return hxUserSuppinfoDao.selectHxUserSuppinfoOne(hus);
	}

	@Override
	public int updateHxUserSuppinfo(HxUserSuppinfo hus) {
		return hxUserSuppinfoDao.updateHxUserSuppinfo(hus);
	}
	@Override
	public int updateHxUserSuppinfoBatch(ArrayList<HxUserSuppinfo> updateList) {
		return hxUserSuppinfoDao.updateHxUserSuppinfoBatch(updateList);
	}

}
