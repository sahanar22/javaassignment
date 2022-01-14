package com.sahana.learning;
import java.util.Scanner;

public class ValidateUserName {

	
		

		
			
			String username;
			 int password;
		    static boolean Verifying(String username,int password)
			{
				if(username.length()>=12 && username.endsWith("_job"))
				{
					return true;
				}
					else
					{
					return false;
				}
				
			}
			
			

			public static void main(String[] args) {
				
				Scanner scn=new Scanner(System.in);
				ValidateUserName j1=new ValidateUserName();

				System.out.println("Enter username and password");
				
				if(Verifying(j1.username=scn.next(),j1.password=scn.nextInt()))
				
					System.out.println("yes");
				else
					System.out.println("no");
				

			}

		
	}


