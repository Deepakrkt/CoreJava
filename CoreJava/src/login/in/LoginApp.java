package login.in;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int maxAttempt = 3;
	        int attempt = 1;

	        String userName = "Deepak";
	        String passwd = "password";
	        
	        
		 do {
	            System.out.println("Enter your login name:");
	            String username = sc.nextLine();

	            System.out.println("Enter your password:");
	            String password = sc.nextLine();

	            if (username.equals(userName) && password.equals(passwd)) {
	                System.out.println("Welcome, " + username + "!");
	                break;
	            } else {
	                attempt++;
	                System.out.println("Invalid credentials. You have " + (maxAttempt - attempt) + " attempts left.");
	            }
	        } while (attempt < maxAttempt);

	        if (attempt >= maxAttempt) {
	            System.out.println("Contact Admin. Maximum attempts reached.");
	        }

	}

}
