package com.builder.rizvi;

/**
 * 
 * @author rizvi
 *
 */
class LinkedinUser {
	String userName;
	UserBasicInfo userInfo;
	ContactInfo contactInfo;

	public LinkedinUser(String uName) {
		this.userName = uName;
	}

	public void setUserBasicInfo(UserBasicInfo info) {
		this.userInfo = info;
	}

	public void setContactInfo(ContactInfo info) {
		this.contactInfo = info;
	}

	public String getUserName() {
		return userName;
	}

	public UserBasicInfo getUserBasicInfo() {
		return userInfo;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|User|").append(userName).append("|UserInfo|").append(userInfo).append("|ContactInfo|")
				.append(contactInfo);
		return sb.toString();
	}

	static class LinkedinUserBuilder {
		LinkedinUser user;

		public LinkedinUserBuilder(String userName) {
			this.user = new LinkedinUser(userName);
		}

		public LinkedinUserBuilder setUserBasicInfo(UserBasicInfo info) {
			user.setUserBasicInfo(info);
			return this;
		}

		public LinkedinUserBuilder setContactInfo(ContactInfo info) {
			user.setContactInfo(info);
			return this;
		}

		public LinkedinUser build() {
			return user;
		}
	}
}