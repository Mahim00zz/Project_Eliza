/*
 * https://youtu.be/RlhN3ha9wSM
 * Name: Mahim Rahaman
 * Description: This is Project_Eliza , This is a conversational project. Eliza will be its name and it will prompt questions based on my responses accordingly.
 * 				Our main goal is to be able to use the first and the last word of the user response to come up with either a question or a statement. We will
 * 				also make Eliza respond accordingly if the user inputs anything with '.' , '?' and '!'.
 * Date created: 05/07/23
 * Date Modified: 05/11/23
 * Email: Mahim.Rahaman@lc.cuny.edu
 */

import java.util.Scanner; 

public class ProjectEliza {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		PromptBank bank = new PromptBank();
		
		boolean YesOrNo;
		
		do {
            System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
            System.out.print("USER: ");
            
            String usersName = scnr.nextLine();

            System.out.println("ELIZA: Hello, " + usersName + ". Tell me what is on your mind today in 1 sentence.");

            String sentence;
	
            do {
                
            	System.out.print("USER: ");
                sentence = scnr.nextLine();

                if (!sentence.equalsIgnoreCase("EXIT")) {
                    
                	String[] words = sentence.split(" ");
                    
                	String firstWord = words[0];
                    String lastWord = words[words.length - 1];
                    
                    char lastChar = sentence.charAt(sentence.length() - 1);
		
                if (lastChar == '?') {
                        
                	String randomQuestion = bank.getRandomQuestionTrunk();
                    String response = randomQuestion.replace("BLANK1", firstWord);
                           
                    String Respond = response.replace("BLANK2", lastWord.substring(0, lastWord.length() - 1));
                        
                           System.out.println("ELIZA: " + Respond);
                    
                } else if (lastChar == '!') {
                        
                	String randomStatement = bank.getRandomStatementTrunk();
                    String response = randomStatement.replace("BLANK1", firstWord.substring(0, firstWord.length() - 1));
                           
                    String Respond = response.replace("BLANK2", lastWord.substring(0, lastWord.length() - 1));
                        
                    		System.out.println("ELIZA: WOW! Dramatic! " + Respond);
                    
                } else if (lastChar == '.') {
                        
                	String randomStatement = bank.getRandomStatementTrunk();
                    String response = randomStatement.replace("BLANK1", firstWord);
                                
                    String Respond = response.replace("BLANK2", lastWord.substring(0, lastWord.length() - 1));
                        
                    	   System.out.println("ELIZA: " + Respond);
                   
                } else {
                        
                	String randomStatement = bank.getRandomStatementTrunk();
                    String response = randomStatement.replace("BLANK1", firstWord);
                                
                    String Respond = response.replace("BLANK2", lastWord);
                        
                    	   System.out.println("ELIZA: " + Respond);
                }
             }
            	
            	} while (!sentence.equalsIgnoreCase("EXIT"));

            System.out.println("ELIZA: Do you want to run the session again?");
            System.out.print("User: ");
            String userChoice = scnr.nextLine();
            
            YesOrNo = userChoice.equalsIgnoreCase("YES");

        } while (YesOrNo);

        System.out.println("ELIZA: Goodbye, until next time");    
                    
	}
}
		
		

