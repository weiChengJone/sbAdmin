package com.bypay.domian;

import java.io.Serializable;

public class HxUserSuppinfo implements Serializable {
	private String userId;				//	用户编号	USER_ID	BIGINT	TRUE	自增 主键
	private String userName;			//	用户姓名	USER_NAME	VARCHAR(20)		
	private String idcardType;			//	证件类型	IDCARD_TYPE	VARCHAR(2)	01.身份证	02.军官证	03.护照
	private String idcardNum;			//	证件号码	IDCARD_NUM	VARCHAR(20)		
	private String address;				//	通讯地址	ADDRESS	VARCHAR(100)		
	private String idcardImg;			//	证件正面图片存放路径	IDCARD_IMG
	private String idcardImgOpposite;	//	证件反面图片存放路径	IDCARD_IMG_OPPOSITE	
	private String idcardImgHold;//手持生分证
	private String icon;				//	头像图标	ICON	VARCHAR2(255)		个人头像二进制存储
	private String updateCount;			//	修改次数	UPDATE_COUNT
	private String value;				//	预留字段	VALUE	VARCHAR(200)
	
	public String getIdcardImgHold() {
		return idcardImgHold;
	}
	public void setIdcardImgHold(String idcardImgHold) {
		this.idcardImgHold = idcardImgHold;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdcardType() {
		return idcardType;
	}
	public void setIdcardType(String idcardType) {
		this.idcardType = idcardType;
	}
	public String getIdcardNum() {
		return idcardNum;
	}
	public void setIdcardNum(String idcardNum) {
		this.idcardNum = idcardNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdcardImg() {
		return idcardImg;
	}
	public void setIdcardImg(String idcardImg) {
		this.idcardImg = idcardImg;
	}
	public String getIdcardImgOpposite() {
		return idcardImgOpposite;
	}
	public void setIdcardImgOpposite(String idcardImgOpposite) {
		this.idcardImgOpposite = idcardImgOpposite;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUpdateCount() {
		return updateCount;
	}
	public void setUpdateCount(String updateCount) {
		this.updateCount = updateCount;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
