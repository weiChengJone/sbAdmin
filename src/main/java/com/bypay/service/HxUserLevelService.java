package com.bypay.service;


import com.bypay.domian.HxUserLevel;

import java.util.List;
import java.util.Map;

public interface HxUserLevelService {
	/**
	 * 新增用户等级信息
	 * @param hxUserLevel
	 * @return
	 */
	Integer insHxUserLevel(HxUserLevel hxUserLevel);

	/**
	 * 用户等级查询
	 * @param map
	 * @return
	 */
	Integer selHxUserLevelCount(Map<String, Object> map);
	List<HxUserLevel> selHxUserLevel(Map<String, Object> map);

	/**
	 * 用户封控等级修改
	 * @param hxUserLevel
	 * @return
	 */
	Integer updHxUserLevel(HxUserLevel hxUserLevel);

	/**
	 * 删除用户等级
	 * @param levelId
	 * @return
	 */
	Integer delHxUserLevel(String levelId);

	/**
	 * 查询单挑用户等级的详细信息
	 * @param hxUserLevel
	 * @return
	 */
	HxUserLevel queryOneInfo(HxUserLevel hxUserLevel);
}