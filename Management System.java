// Post Office Management System
import java.util.*;

interface i1{
	void adduser();
}
interface i2{
	void update();
}

class post implements i1, i2{
	public static void main(String args[]){

	}
	public void adduser(){
		Scanner s = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		System.out.println("");
		System.out.println("Enter your phone no.:");
		long phone = l.nextLong();
		System.out.println("");
		System.out.println("Enter your age:");
		int age = i.nextInt();
		System.out.println("");
		System.out.println("Enter your postal code:");
		int postal_code = i.nextInt();
		System.out.println("");
		System.out.println("USER ADDED SUCCESSFULLY!");
	}
	public void update(){
		Scanner s = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your postal code:");
		int postal_code = i.nextInt();
		System.out.println("");
		System.out.println("1. Name");
		System.out.println("2. Phone no.");
		System.out.println("3. age");
		System.out.println("What you want to update:");
		int up = i.nextInt();
		System.out.println("");
		switch(up){
			case 1:
			System.out.println("Enter new name:");
			String n_name = s.nextLine();
			break;
			case 2:
			System.out.println("Enter new phone no.:");
			long n_ph = l.nextLong();
			break;
			case 3:
			System.out.println("Enter new age:");
			int n_age = i.nextInt();
			break;
			default:
			System.out.println("Please enter give no. only!");
			System.out.println("You are logged out!");
		}
		System.out.println("");
		System.out.println("Details updated successfully!");
	}
}

class f{
	public static void main(String args[]){
		System.out.println("*********Welcome to Post Office Management System*********");
		System.out.println("");
		post p = new post();
		Scanner i = new Scanner(System.in);
		System.out.println("************** WELCOME TO LOGIN PAGE **************");
		System.out.println("");
		System.out.println("Enter your 4 digit user id:");
		int uid = i.nextInt();
		System.out.println("");
		System.out.println("Enter your 6 digit password:");
		int pass = i.nextInt();
		System.out.println("");
		System.out.println("LOGIN SUCCESSFULLY!");
		System.out.println("");
		System.out.println("1. Add user");
		System.out.println("2. Update user");
		System.out.println("Choose what you want:");
		int c = i.nextInt();
		System.out.println("");
		switch(c){
			case 1:
			p.adduser();
			case 2:
			p.update();
		}
	}
}