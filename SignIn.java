
package votingSystem;
import java.util.Scanner;

public class signIn {
	
	public int signInPassword;
	public String signInName;
	Scanner sc=new Scanner(System.in);
	signUp signup=new signUp();
	public void signInInput() {
		System.out.println("NAME AND PASSWORD VERIFICATION");
		System.out.println("\nEnter correct Details:");
		System.out.println("Enter Name:");
		signInName=sc.next();
		System.out.println("Enter password:");
		signInPassword=sc.nextInt();
	}
	public void checkCorrectSignup() {
	if((signInPassword==signup.password)&&(signInName==signup.name2)){
		return;
	}
	else {
		signInInput();
	}
	System.out.println("Corrected entered information");
}
}
