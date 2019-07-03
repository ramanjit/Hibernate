package com.ramanjit.domain;

import java.util.Set;

import javax.persistence.Column;

public class User {
	
private int userId;
private String firstName;
private String lastName;
private String addrs;
private Set<PhoneNumber> phones;
/**
 * @return the phones
 */
public Set<PhoneNumber> getPhones() {
	return phones;
}
/**
 * @param phones the phones to set
 */
public void setPhones(Set<PhoneNumber> phones) {
	this.phones = phones;
}
/**
 * @return the userId
 */
public int getUserId() {
	return userId;
}
/**
 * @param userId the userId to set
 */
public void setUserId(int userId) {
	this.userId = userId;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the addrs
 */
public String getAddrs() {
	return addrs;
}
/**
 * @param addrs the addrs to set
 */
public void setAddrs(String addrs) {
	this.addrs = addrs;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", addrs=" + addrs + "]";
}
}
