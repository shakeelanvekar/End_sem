
public class StoryStates {

	Sstate sstate;
	
	
	public StoryStates(){
		changeState(new Done());
	}
	
	public void changeState(Sstate sstate)
	{
		this.sstate = sstate;
	}
	
	
	public void reading()
	{
		System.out.println("reading");
		sstate.reading();
	}
	
	public void doing()
	{
		System.out.println("doing");
		sstate.doing();
	}

	public void done()
	{
		System.out.println("done");
		sstate.done();
	}
	
	public void pending()
	{
		System.out.println("pending");
		sstate.pending();
	}
	
}
