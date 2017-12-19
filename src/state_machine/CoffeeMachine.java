package state_machine;

import java.util.HashMap;

public class CoffeeMachine extends State{

	private HashMap<String,HashMap<String, String>> tabel;
	private String StareCurenta;
	
	CoffeeMachine()
	{
		
		HashMap<String,HashMap<String,String>> tabel=new HashMap<String,HashMap<String, String>>();

        HashMap<String,String> next=new HashMap<String,String>();
        next.put("5","5");
        next.put("10","10");
        tabel.put("0",next);

        HashMap<String,String> next1=new HashMap<String,String>();
        next1.put("5","10");
        next1.put("10","15");
        tabel.put("5",next1);

        HashMap<String,String> next2=new HashMap<String,String>();
        next2.put("C10","0");
        next2.put("5","15");
        tabel.put("10",next2);

        HashMap<String,String> next3=new HashMap<String,String>();
        next3.put("C15","0");
        next3.put("C10","5");
        tabel.put("15",next3);
        
        StareCurenta="0";
	}	
	
}
	

