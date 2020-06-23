package nn;

class Author {
	String name;
	String email;
	String gender;
	Author(String name,String email,String gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
}
