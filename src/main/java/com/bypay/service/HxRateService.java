package com.bypay.service;

import java.util.List;

import com.bypay.domian.HxRate;

public interface HxRateService {
	/**
	 * 获取所有费率信息
	 * @return
	 */
	public List<HxRate> getAllRate();
}
