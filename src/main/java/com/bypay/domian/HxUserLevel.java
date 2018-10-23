package com.bypay.domian;

import java.io.Serializable;

/**
 * 2.4	用户等级表
 * @author wangjie
 */
public class HxUserLevel implements Serializable {
	private String id;			//	用户等级ID	LEVEL_ID
	private String level;		//	用户级别	LEVEL 1000：一级用户  2000：二级用户  3000：三级用户  4000：四级用户  5000：五级用户
	private String levelName;	//	等级名称	LEVEL_NAME  一级用户   三级用户   三级用户   四级用户   五级用户
	private String levelRange;	//	级别的范围	LEVEL_RANGE
	private String memo;		//	备注	MEMO

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public String getLevelRange() {
		return levelRange;
	}
	public void setLevelRange(String levelRange) {
		this.levelRange = levelRange;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
