package com.bypay.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bypay.dao.HxRateDao;
import com.bypay.domian.HxRate;
import com.bypay.service.HxRateService;
@Service("hxRateService")
public class HxRateServiceImpl implements HxRateService{
	@Autowired
	private HxRateDao hxRateDao;
	@Override
	public List<HxRate> getAllRate() {
		return hxRateDao.getALLRate();
	}

}
