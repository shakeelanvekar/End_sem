
public class Done extends Sstate{
  
	
	public Done(){
		done();
	}
	@Override
	public void reading() {
		// TODO Auto-generated method stub
		System.out.println("reading");
	}

	@Override
	public void doing() {
		// TODO Auto-generated method stub
		System.out.println("doing");
	}

	@Override
	public void done() {
		// TODO Auto-generated method stub
		System.out.println("done");
	}

	@Override
	public void pending() {
		// TODO Auto-generated method stub
		System.out.println("pending");
	}

}
