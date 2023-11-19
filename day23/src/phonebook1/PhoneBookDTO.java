package phonebook1;

public class PhoneBookDTO {

	private String name;
	private String pnum;
	private int age;
	private String favorite;	// 즐겨찾기, (Y혹은 N으로만 넣을 수 있음)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
}
