package courseApi.java.topic;

public class Topic {
	public String name;
	public int id;
	public String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	public Topic() {
		super();
		
	}
	

}
