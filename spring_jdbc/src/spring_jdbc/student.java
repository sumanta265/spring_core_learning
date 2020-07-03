package spring_jdbc;

public class student {

	
	private int id;
	private String name;
    private String Address;
	public student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	
	
}
