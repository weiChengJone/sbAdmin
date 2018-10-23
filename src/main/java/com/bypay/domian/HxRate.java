package com.bypay.domian;

import java.io.Serializable;

public class HxRate implements Serializable {
	/**
	 * 费率ID
	 */
	private Integer rateId;
	/**
	 * 费率类型
	 */
	private Integer rateType;
	/**
	 * 费率
	 */
	private String feeRate;
	/**
	 * 费率描述
	 */
	private String rateDesc;
	/**
	 * 预留字段
	 */
	private String remark;
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public Integer getRateType() {
		return rateType;
	}
	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}
	public String getFeeRate() {
		return feeRate;
	}
	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
	}
	public String getRateDesc() {
		return rateDesc;
	}
	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
