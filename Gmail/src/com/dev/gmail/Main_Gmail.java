package com.dev.gmail;
import java.util.Scanner;

public class Main_Gmail extends Imp {
	static Scanner sc = new Scanner(System.in);
	static Imp i = new Imp();
		

	public static void main(String[] args) {
		
		Account mg1 = new Account();
		mg1.setUser_id(101);
		mg1.setUser_name("Balakrishna Mandal");
		mg1.setPassword(2707);
		mg1.setEmail("mandalbalakrishna@gmail.com");
		
		Account mg2 = new Account();
		mg2.setUser_id(102);
		mg2.setUser_name("Abhinash Choudhary");
		mg2.setPassword(1545);
		mg2.setEmail("abhinch@gmail.com");
		
		Account mg3 = new Account();
		mg3.setUser_id(103);
		mg3.setUser_name("Rajesh Singh");
		mg3.setPassword(7996);
		mg3.setEmail("rajesh204@gmail.com");
		
		Account mg4 = new Account();
		mg4.setUser_id(104);
		mg4.setUser_name("Taniya Kumar");
		mg4.setPassword(2408);
		mg4.setEmail("kumartaniya@gmail.com");
		
		Account mg5 = new Account();
		mg5.setUser_id(105);
		mg5.setUser_name("Sheja Sinha");
		mg5.setPassword(6426);
		mg5.setEmail("shejasinha@gmail.com");
		
			
		
		System.out.println("Press 1 to login\r\n" + 
							"Press 2 to register");
		int n = sc.nextInt();
		
		if(n==1)
		{
			i.login();
		}
		else if (n==2) {
			i.register(mg1);
			
		}
		else
		{
			System.out.println("Invalid input!!");
		} 

	}

}
