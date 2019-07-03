package com.ramanjit.domain;

public class PhoneNumber {
	private long phone;
	private String provider;
	private String numberType;
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	/**
	 * @return the numberType
	 */
	public String getNumberType() {
		return numberType;
	}
	/**
	 * @param numberType the numberType to set
	 */
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", provider=" + provider + ", numberType=" + numberType + "]";
	}

}
