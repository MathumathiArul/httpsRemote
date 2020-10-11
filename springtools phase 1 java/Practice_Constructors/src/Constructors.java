
public class Constructors {
	private int id;
	private String name;
	private String location;
	private char sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	
	
	public Constructors(String name, String location, char sex) {
		this.name = name;
		this.location = location;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Constructors [id=" + id + ", name=" + name + ", location=" + location + ", sex=" + sex + "]";
	}
	
	
	
	
}