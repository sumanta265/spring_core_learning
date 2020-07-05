package spring_obj_inject;

public class school {

	
	student sc;
	
	public  school(student sc)
	{
		this.sc=sc;
		System.out.println("school const called");
	}
	
	public void show()
	{
		
		sc.Show();
		
	}
	
	
	
	
	
	
	
	
	
}
