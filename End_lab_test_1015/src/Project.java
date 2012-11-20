
public class Project {
 
String Pname;
	 

	public Project(String name) {
		// TODO Auto-generated constructor stub
		
		 System.out .println("new Project");
			this.Pname =name;
			System.out.println(Pname);
			Sprint sp1=new Sprint("3 weeks");
		
			
			sp1.stories();
		 
			
			
		Team t1=new ProductOwner();	
		Team t2=new ScrumMaster();	
		Team t3=new Customer();
		Team t4=new TeamMember();
		
		t1.Role();
		t2.Role();
		t3.Role();
		t4.Role();
		
		
		
		
		
	}
	
	
}
