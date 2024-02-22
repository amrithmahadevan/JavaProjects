package sample_programs_notepadplus;

public class VotingEligibility {
	public static boolean eligibility(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		int candidateAge=22;
		boolean isEligible=eligibility(candidateAge);
		if(isEligible)
		{
			System.out.println("The candidate is eligible for voting");
		}
		else
		{
			System.out.println("The candidateis NOT eligible for voting");
		}
	}
}
