import java.util.Scanner;
	
	public class QuizGame {
		public static void main(String [] args) {

			Scanner sc = new Scanner(System.in);

			
			System.out.print("Question 1: ");
			System.out.println("Who was the former president of nigeria(Buhari,Obasanjo,Atiku:)");

			String choice = sc.nextLine();

			if(choice.equals("Buhari")) {
                        System.out.println("Your correct");
			System.out.println("You got one question right");
			System.out.println("You scored 10 marks");

		 } else if(choice.equals("Obasanjo")) {
			System.out.println("Your wrong try again");

		 } else if(choice.equals("Atiku")) {
			System.out.println("Your wrong try again");

			

			
			
}
}
}
			