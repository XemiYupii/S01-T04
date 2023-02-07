package exercici1;

import java.util.ArrayList;

public class Any {
	
	private ArrayList<String>mesos;
	
	public Any() {
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


}
