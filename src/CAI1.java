package guerrero_p3;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	static int total;
	static  int inputUser;
	static int number1, number2;
	static Scanner input = new Scanner(System.in);
	
	/*The program shall generate random numbers with a SecureRandom object
	The program shall ask the student to solve a multiplication problem
	A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
	The program shall display the message "Very good!" if the student provides a correct response
	The program shall display the message "No. Please try again." if the student provides an incorrect response
	The program shall terminate when a correct response is provided by the student
	The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer
	Create a method called "quiz" that contains the program logic
	Create a method called "askQuestion" that prints the problem to the screen
	Create a method called "readResponse" that reads the answer from the student
	Create a method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
	Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
	Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
	Create a main method that runs your program by calling the "quiz" method
	 */
	
	public void quiz() 
	{
		//CAI1 total = new CAI1();
		//CAI1 result = new CAI1();
//		total.askQuestion();
//		total.readResponse();
//		total.isAsnwerCorrect();
		askQuestion();
		readResponse();
	    isAsnwerCorrect();
		
	}
	
	public void askQuestion() 
	{
		SecureRandom ramdon1 = new SecureRandom();
		
		number1    =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("how much is %d ",    number1);    //    display    generated    value
            
        number2   =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("time %d        ", number2   ); 
        System.out.println(  ) ;//    display    generated    value
     }
	
	
	public int readResponse()
	{
		
		System.out.println("please enter your answer ");
		inputUser = input.nextInt();
		
		return inputUser;
	}
	
	public void  isAsnwerCorrect()
	{
		  total = number1*number2;
	      System.out.println(total);
		  
	      while (total!=inputUser)
		  {
			displaynoCorrectResponse();// call a method 
			
		  }
		     
	      displayCorrectResponse() ;//call method
	
		
		
	}
	 
	public void displayCorrectResponse() 
	{
		 System.out.println("Very good");
	}
	
	public void displaynoCorrectResponse() 
	{	
		System.out.println("No, please try again");
		System.out.printf("how much is %d ",    number1);    
        System.out.printf("time %d        ", number2   ); 
        System.out.println(  ) ;
        readResponse();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI1 total = new CAI1();
	    total.quiz();

	}

}
