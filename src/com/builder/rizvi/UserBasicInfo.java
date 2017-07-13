package com.builder.rizvi;

/**
 * 
 * @author rizvi
 *
 */
class UserBasicInfo {
	String firstName;
	String lastName;
	String userName;
	String birthDate;
	String gender;

	public UserBasicInfo(String fName, String lName, String uName, String date, String gender) {
		this.firstName = fName;
		this.lastName = lName;
		this.userName = uName;
		this.birthDate = date;
		this.gender = gender;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName:LastName:UserName:DOB:Gender:").append(firstName).append(":").append(lastName).append(":").append(userName).append(":").append(birthDate).append(":").append(gender);
		return sb.toString();
	}
}