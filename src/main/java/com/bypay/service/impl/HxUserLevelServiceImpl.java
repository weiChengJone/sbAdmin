package com.bypay.service.impl;


import com.bypay.dao.HxUserLevelDao;
import com.bypay.domian.HxUserLevel;
import com.bypay.service.HxUserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class HxUserLevelServiceImpl implements HxUserLevelService {
	@Autowired
	private HxUserLevelDao hxUserLevelDao;

	@Override
	public Integer insHxUserLevel(HxUserLevel hxUserLevel) {
		return hxUserLevelDao.insHxUserLevel(hxUserLevel);
	}

	@Override
	public List<HxUserLevel> selHxUserLevel(Map<String, Object> map) {
		return hxUserLevelDao.selHxUserLevel(map);
	}

	@Override
	public Integer updHxUserLevel(HxUserLevel hxUserLevel) {
		return hxUserLevelDao.updHxUserLevel(hxUserLevel);
	}

	@Override
	public Integer selHxUserLevelCount(Map<String, Object> map) {
		return hxUserLevelDao.selHxUserLevelCount(map);
	}

	@Override
	public Integer delHxUserLevel(String levelId) {
		return hxUserLevelDao.delHxUserLevel(levelId);
	}

	@Override
	public HxUserLevel queryOneInfo(HxUserLevel hxUserLevel) {
		return hxUserLevelDao.queryOneInfo(hxUserLevel.getId());
	}
}
