package votingSystem;

public class VotingSystemMain {
	public static void main(String[] args) {
		signUp signup=new signUp();
		signup.inputSignUpdetails();
		signIn signin=new signIn();
		signin.signInInput();
		signin.checkCorrectSignup();
	}

}
