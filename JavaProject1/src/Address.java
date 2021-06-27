
public class Address {
	private String flatNo;
	private String aptName;
	private String roadName;
	private String area;
	private String city;
	private String zipcode;
	/*
	 * initialization of instance data members is done either
	 * by using setter method or by using constructor
	 * Constructor is invoked when a new object is created
	 * setter can be invoked to modify existing object
	 */
	public Address(String flatNo, String aptName, String roadName, String area, String city, String zipcode) {
		this.flatNo = flatNo;
		this.aptName = aptName;
		this.roadName = roadName;
		this.area = area;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", aptName=" + aptName + ", roadName=" + roadName + ", area=" + area
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	 
	
	
}
