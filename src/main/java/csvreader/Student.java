package csvreader;

import java.util.Map;

public class Student {

	private String id;
	private String name;
	private String age;

	@Override
	public String toString() {
		return "{id: " + id + ", name:" + name + ", age:" + age + "}";
	}

	public Student(Map<String, String> row) {
		this.id = row.get("ID");
		this.name = row.get("Name");
		this.age = row.get("Age");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
