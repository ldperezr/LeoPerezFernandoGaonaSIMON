package co.edu.unbosque.model;

public class GeneyCoparador {
	
	public GeneyCoparador() {
	}
	
	public int generarnumeroA () {
		int j=(int)(Math.random()*4+1);
		
		return j;
		
	}
	public boolean compararnumeros(String dato1 ,String dato2) {
	boolean t=false;
		if(dato1.equalsIgnoreCase(dato2)) {
			t=true;
		}
		return t;
		
		
		
	}
}
