package task7;

public class Person {
    private String name;            // 名前
    private String company;         // 勤務先の会社名
    private String officeNumber;    // 勤務先の市内電話番号
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public Person(String name, String company,
		  String officeAreaCode, String officeNumber) {
	this.name = name;
	this.company = company;
	this.setOfficeAreaCode();
	this.officeNumber = officeNumber;
	officeAreaCode = officeTelephone.setAreaCode();
    }

    public String getName() {
	return name;
    }
    public String getCompany() {
	return company;
    }
    public String getOfficeTelephoneNumber() {
	return getOfficeAreaCode() + "-" + officeNumber;
    }
    
	private String getOfficeAreaCode() {
		return officeAreaCode;
	}

	private void setOfficeAreaCode() {
		this.officeAreaCode = officeAreaCode;
	}
}