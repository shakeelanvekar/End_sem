
public class Sprint {

String duration;
 

public Sprint(String string) {
		// TODO Auto-generated constructor stub
	
	
	this.duration =string;
	System.out .println("duration of sprint :"+duration);
	}

public void stories() {
	// TODO Auto-generated method stub
	UserStories us=new UserStories();
	
	us.setpriority(1);
	us.setpoint(10);
	
	
	Task t1= new Task();
	t1.designing();
	t1.coding();
	t1.testing();
}

 	
	
	
}
