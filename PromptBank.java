public class PromptBank {

	String [] questions;
	String [] statements;
	
	public PromptBank(){
		
		
		
		questions = new String[5]; //initialize your array to the correct length to match your number of questions you populate it with
		statements = new String [5]; //initialize your array to the correct length to match your number of questions you populate it with
		
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2.";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "It seems like BLANK1 and BLANK2 are on your mind. Let's talk about them and why they matter to you.";
		statements[4] = "BLANK1 and BLANK2 have clearly captured your attention, and I'm genuinely eager to explore, tell me more.";
		
		
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "Apart from BLANK1 and BLANK2, is there anything else that sparks your interest?";
		questions[4] = "When it comes to BLANK1, do you find it bothersome? And what about BLANK2, does it also pose any concerns for you?";
		
		
		
	}
	public String getRandomStatementTrunk(){
		
		populateStatementsArray();
		
		int rand = (int)(Math.random()*5);
		
		return statements[rand];
		
	}
	
	
	
	
	public String getRandomQuestionTrunk(){
		
		populateQuestionsArray();
		
		int rand = (int)(Math.random()*5);
		
		return questions[rand]; 
		
	}
	
	
	
	
	
	
	
	
}
