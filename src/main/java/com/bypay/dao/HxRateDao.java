package com.bypay.dao;

import java.util.List;

import com.bypay.domian.HxRate;

public interface HxRateDao {
	/**
	 * 获取所有费率
	 * @return
	 */
	List<HxRate> getALLRate();
}
