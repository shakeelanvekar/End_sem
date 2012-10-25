
public class View extends  Observer{


	Controler ct;
	Model md;
	int data;
	public void initialize(Model md) {
		// TODO Auto-generated method stub
		this.md=md;
		md.attach((Observer)this);
		makecontroler();
		ct.initialize(md,this);
		
	}
	private void makecontroler() {
		// TODO Auto-generated method stub
		this.ct=new Controler();
		
	}
	public void press() {
		// TODO Auto-generated method stub
		ct.handelEvent();
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update of view");
		display();
		
	}

	private void display() {
		// TODO Auto-generated method stub
		
		this.data=md.getdata();
		System.out.println("Data is: "+ this.data);
		
	}

}
