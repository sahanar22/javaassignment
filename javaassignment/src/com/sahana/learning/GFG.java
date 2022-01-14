package com.sahana.learning;
import java.util.Arrays;

public class GFG {

	
	

	
			static boolean isAlphabaticOrder(String s)
			{
				
				int n = s.length();
			
				
				char c[] = new char [n];
			
				
				for (int i = 0; i < n; i++) {
					c[i] = s.charAt(i);
				}
			
				
				Arrays.sort(c);
			
				
				for (int i = 0; i < n; i++)
					if (c[i] != s.charAt(i))
						return false;
					
				return true;	
			}
			
			public static void main(String args[])
			{
				String s = "ant";
				
				
				if (isAlphabaticOrder(s))
				System.out.println("Yes");
				else
					System.out.println("No");
				
			
			
		

	}

}
