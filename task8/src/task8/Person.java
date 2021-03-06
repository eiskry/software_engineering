package task8;

public class Person {
    private String name;            // 名前
    private String company;         // 勤務先の会社名
    private String officeAreaCode;  // 勤務先の市外局番
    private String officeNumber;    // 勤務先の市内電話番号

    public Person(String name, String company,
		  String officeAreaCode, String officeNumber) {
	this.name = name;
	this.company = company;
	this.officeAreaCode = officeAreaCode;
	this.officeNumber = officeNumber;
    }

    public String getName() {
	return name;
    }
    public String getCompany() {
	return company;
    }
    public String getOfficeTelephoneNumber() {
	return officeAreaCode + "-" + officeNumber;
    }
}