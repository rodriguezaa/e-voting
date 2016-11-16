
public class voter {
//	voter ID contains the ID of a voter as an int.
	private int voter_ID;
//	vovterName contains the full name of the voter
	public String voterName;
//	voter info contains other information of the voter which could include registration status.
	public String voterInfo;
	
	public String voterPassword;
	
	public int age;
	
	public voter(){
		
	}
	
	public voter(int voteID, String voteName, int vAge,String voteInfo, String votePass){
		voter_ID = voteID;
		voterName = voteName;
		age = vAge;
		voterInfo = voteInfo;
		voterPassword = votePass;
		
	}
	
//	Purpose: get the voter ID 
//	Preconditions: none
//	Postconditions: return voter ID
	public int getVoter_ID() {
		return voter_ID;
	}

//	Purpose: set the voter ID
//	Preconditions: none
//	Postconditions: updates the voter ID
	public void setVoter_ID(int voter_ID) {
		this.voter_ID = voter_ID;
	}
	
	public void setVoterName( String name){
		this.voterName = name;
	}
	
	public String getVoterName(){
		return voterName;
		
	}
	
	public void setAge( int vAge){
		this.age = vAge;
	}
	
	public void getAge(){
		
	}
	public void setVoterInfo(String info){
		this.voterInfo = info;
	}
	public String getVoterInfo(){
		return voterInfo;
	}
	public void setVoterPassword(String pass){
		this.voterPassword = pass;
	}
	
	public String getVoterPass(){
		return voterPassword;
	}
//	Purpose:logs the user in uses approve login
//	Preconditions: use login information for the voter
//	Postconditions: use is logged in
	public void login(){
		
		
	}
//	Purpose:select a candidate 
//	Preconditions: none
//	Postconditions: marks candidate as selected and saved for review later
	public void selectCandidate(){
		
	}
	
//	Purpose: confirm selected candidates 
//	Preconditions: none
//	Postconditions: votes are sent to the voter handler once confirmed
	public void castVote(){
		
	}
	
}
