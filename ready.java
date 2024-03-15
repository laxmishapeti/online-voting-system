package votingSystem;
import java.util.Scanner;
public class ReadytoVote {
	public int selectVote;
	Scanner sc=new Scanner(System.in);
	signUp up=new signUp();
	//String name=up.name2;
	//int Voterid=up.voteId;
	public void DisplayVoterInfo() {
		System.out.println("VOTERS DETAIL DISPLAY");
		System.out.println("Name:"+up.name2);
		System.out.println("Voter Id:"+up.voteId);
	}
	public void DisplayRules() {
		System.out.println("\nRULES FOR VOTING");
		System.out.println("1.You can vote once\n2.Choose According Party\nThankyou");
		
	}
	public void Vote() {
		
		System.out.println("VOTE YOUR PARTY\n1.BJP\n2.CONGRESS\n3.JANATA DAL SECULAR\n4.OTHERS");
		System.out.println("Choose option:");
		selectVote=sc.nextInt();
		System.out.println("Voting Completed...! Thank you");
	}
}
