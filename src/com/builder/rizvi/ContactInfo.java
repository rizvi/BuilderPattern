package com.builder.rizvi;
/**
 * 
 * @author rizvi
 *
 */
class ContactInfo {
	String eMail;
	String mobileHome;
	String mobileWork;

	public ContactInfo(String mail, String homeNo, String mobileOffice) {
		this.eMail = mail;
		this.mobileHome = homeNo;
		this.mobileWork = mobileOffice;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("email:mobile(H):mobile(W):").append(eMail).append(":").append(mobileHome).append(":")
				.append(mobileWork);
		return sb.toString();
	}
}