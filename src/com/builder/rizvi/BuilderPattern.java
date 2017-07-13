package com.builder.rizvi;

/**
 * 
 * @author rizvi
 *
 */
public class BuilderPattern {
	public static void main(String args[]) {
		LinkedinUser lnUser1 = new LinkedinUser.LinkedinUserBuilder("Rizvi").build(); // Mandatory
		UserBasicInfo info = new UserBasicInfo("Md. Abu Zakir", "Rizvi", "zakir", "19-May-1989", "M");

		// Build User name + Optional Basic Info
		LinkedinUser lnUser2 = new LinkedinUser.LinkedinUserBuilder("Rizvi").setUserBasicInfo(info).build();

		// Build User name + Optional Basic Info + Optional Contact Info
		ContactInfo cInfo = new ContactInfo("rizvi3389ict@gmail.com", "+8801719******", "+8801914******");
		LinkedinUser lnUser3 = new LinkedinUser.LinkedinUserBuilder("Rizvi").setUserBasicInfo(info)
				.setContactInfo(cInfo).build();

		System.out.println("Linkedin user 1:" + lnUser1);
		System.out.println("Linkedin user 2:" + lnUser2);
		System.out.println("Linkedin user 3:" + lnUser3);
	}
}