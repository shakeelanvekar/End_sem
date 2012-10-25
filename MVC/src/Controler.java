
public class Controler extends Observer {

	View vw;
	Model md;
	

	public void initialize(Model md1, View view) {
		// TODO Auto-generated method stub
		this.vw=view;
		this.md=md1;
		md.attach(this);
		
	}

	public void handelEvent() {
		// TODO Auto-generated method stub
		md.service();
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update of Controller");

		
	}



	
	

}
