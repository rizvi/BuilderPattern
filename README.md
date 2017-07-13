# BuilderPattern
It describes builder pattern.

**Builder pattern** is useful when you have few mandatory attributes and many optional attributes to construct a object. To create an object with different mandatory and optional attributes, you have to provide complex constructor to create the object.Builder pattern provides simple step-by-step process to construct a complex object.

# Real life use case:

Different users in Linkedin have different attributes, which consists of mandatory attribute like user name and optional attributes like UserBasicInfo and ContactInfo. Some users simply provide basic info. Some users provide detailed information including Contact info. **In absence of Builder pattern, you have to provide a constructor with all mandatory and optional parameters. But Builder pattern simplifies the construction process by providing simple step-by-step process to construct the complex object.**

# Tips:

1. Provide a static nested builder class.
2. Provide constructor for Mandatory attributes of object.
3. Provide setter and getter methods for optional attributes of object.
4. Return the same Builder object after setting optional attributes.
5. Provide build() method, which returns complex object


# Explanation:

LinkedinUser is a complex object with below attributes using composition:

i) String userName;

ii) UserBasicInfo userInfo;

iii) ContactInfo contactInfo;


LinkedinUserBuilder is a static builder class, which contains and builds LinkedinUser.

**userName** is only Mandatory parameter to build LinkedinUser

LinkedinUserBuilder builds LinkedinUser by setting optional parameters : **UserBasicInfo** and  **ContactInfo**

This example illustrates three different LinkedinUsers with different attributes, built from Builder.


i) lnUser1 was built as LinkedinUser with userName attribute only

ii) lnUser2 was built as LinkedinUser with userName and UserBasicInfo

iii) lnUser3 was built as LinkedinUser with userName,UserBasicInfo and ContactInfo

In above example, composition has been used instead of duplicating all attributes of LinkedinUser in Builder class.

In creational patterns, we will first start with simple pattern like FactoryMethod and move towards more flexible and complex patterns like AbstractFactory and Builder.

# Resource Link:
https://stackoverflow.com/documentation/design-patterns/1811/builder-pattern/17177/builder-pattern-in-java-with-composition#t=201707130922154239387
