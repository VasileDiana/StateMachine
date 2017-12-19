package state_machine;

import java.util.HashMap;


public  class State {

	private String StareCurenta;
	
	private  HashMap<String, HashMap<String,String>> tabel = new HashMap<String, HashMap<String, String>>();
	
	public  void SchimbareStare(String actiune)
	{
		if(tabel.get(StareCurenta).get(actiune)!=null)
            StareCurenta=tabel.get(StareCurenta).get(actiune);
		
		if (actiune.equals("C10")||actiune.equals("C15")) {
            System.out.println("Preparare "+actiune);
	     }
		 System.out.println("Creditul dvs este " +StareCurenta);
         
	}
         
	   
	
}
