package task7;

public class Person {
    private String name;            // 名前
    private String company;         // 勤務先の会社名
//    private String officeNumber;    // 勤務先の市内電話番号
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public Person(String name, String company,
		  String officeAreaCode, String officeNumber) {
	this.name = name;
	this.company = company;
	this.setOfficeAreaCode(officeAreaCode);
	this.setOfficeNumber(officeNumber);
    }

    public String getName() {
	return name;
    }
    public String getCompany() {
	return company;
    }
    public String getOfficeTelephoneNumber() {
//	return getOfficeAreaCode() + "-" + getOfficeNumber();
    	return officeTelephone.getTelephoneNumber(); 
    }
//    
//	private String getOfficeAreaCode() {
//		return officeTelephone.getAreaCode();
//	}

	private void setOfficeAreaCode(String officeAreaCode) {
//		this.officeAreaCode = officeAreaCode;
		officeTelephone.setAreaCode(officeAreaCode);
	}
//
//	private String getOfficeNumber() {
//		return officeTelephone.getNumber();
//	}

	private void setOfficeNumber(String officeNumber) {
		officeTelephone.setNumber(officeNumber);
	}
}