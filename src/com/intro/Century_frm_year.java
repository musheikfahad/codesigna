package com.intro;

public class Century_frm_year {
	
	private void find (int year ) {
		
		if (year%100!=0){
			year=    ( (year/100)+1);
			    System.out.println(year);
			  }
			  else 
			  {
			      year = (year/100);
			     System.out.println(year);
			  }
		
		
		

	}

	public static void main(String[] args) {
		Century_frm_year obj = new Century_frm_year();
		obj.find(101);

	}

}
