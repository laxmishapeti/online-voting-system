package votingSystem;
import java.util.Scanner;
public class signUp {
	public String name1,name2;
	public int voteId;
	public int birthYear,password;
	Scanner sc=new Scanner(System.in);
	public void inputSignUpdetails() {
		System.out.println("-----------WELCOME TO ONLINE VOTING SYSTEM-----------");
		
		System.out.println("\nSIGN IN WITH YOUR DETAILS");
		System.out.println("Enter Your name:");
		name1=sc.next();
		name2=name1;
		System.out.println("Enter your voting ID:");
		voteId=sc.nextInt();
		System.out.println("Enter your Birth Year:(Remember it)");
		birthYear=sc.nextInt();
		password=birthYear;
		
	}
	
}
