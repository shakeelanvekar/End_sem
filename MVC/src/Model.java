import java.util.ArrayList;
public class Model{

	View vw;
	Controler ct;
	int data;
	ArrayList<Observer> obs=new ArrayList<Observer>();
	
	
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		this.obs.add(observer);
		
	}


	public void service() {
		// TODO Auto-generated method stub
		this.notifyObserver();
		
	}


	private void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<this.obs.size();i++)
		{
			obs.get(i).update();
		}
		
	}


	public int getdata() {
		// TODO Auto-generated method stub
		return data;
	}

}
