package task7;

public class TelephoneNumber {
	private String areaCode;
	private String number;
	
	public String getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String Number) {
		this.number = Number;
	}
	
	public String getTelephoneNumber() {
		return getAreaCode() + "-" + getNumber();
	}
}