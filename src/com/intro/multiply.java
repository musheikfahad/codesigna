package com.intro;

public class multiply {
	
	static	public int solution(int D, String S) {

		
			String j = S.replace("one", "1");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		
		}
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(1, "one"));
		
		
		
		
		
		
		
		
	}
		
//		int d = 2;
//
//		String S = "one";
//		if (S.equalsIgnoreCase("one")) {
//		String j =	S.replace("one", "1");
//
//			int h = Integer.parseInt(j);
//
//			int total = h * d;
//			System.out.println(total);
//		
//	}

}
