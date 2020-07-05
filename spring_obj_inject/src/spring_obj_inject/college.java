package spring_obj_inject;

public class college {

	
	

	student sc;
	
	public  college(student sc)
	{
		this.sc=sc;
		System.out.println("college const called");
	}
	
	public void show()
	{
		
		sc.Show();
		
	}
	
	
	
	
	
	
	
	
	
	
}
