package hrtest;

//	COUNTRY_ID   NOT NULL CHAR(2)      
//	COUNTRY_NAME          VARCHAR2(40) 
//	REGION_ID             NUMBER   

public class CountryDTO {
	
	private String country_id;		// 국가코드
	private String country_name;	// 국가명
	private int region_id;			// 지역번호
	
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
}
