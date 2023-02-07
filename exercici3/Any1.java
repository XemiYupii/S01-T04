package exercici3;

import java.util.ArrayList;

public class Any1 {
	
	private ArrayList<String>mesos;
	
	public Any1() {
		mesos = new ArrayList<>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");
		}
	
	public ArrayList<String> getMesos(){
		return mesos;
	}
	
	public void veureMes (int posicio) throws ArrayIndexOutOfBoundsException{
		if (posicio < 0 || posicio > mesos.size())
			throw  new ArrayIndexOutOfBoundsException();
		else 
			System.out.println(mesos.get(posicio));
	}

}