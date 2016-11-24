//Rock, Paper, Scissors
import java.util.Scanner;
import java.util.Random;

public class rps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner to grab user input later in code
		String cpu; 
		Random r = new Random(System.currentTimeMillis()); //Generates random number based on time
		int random = r.nextInt(3-0) + 0; //Sets the range of random numbers 
		if (random == 1){
			cpu = "Rock";
		}//If random number is one than cpu is Rock
		else if (random == 2){
			cpu = "Paper";
		}//If random number is two than cpu is Paper
		else{
			cpu = "Scissors";
		}//If the random number is not one or two then the cpu is Scissors
		System.out.println("Please enter whether you want to play Rock, Paper or Scissors: ");
		String user = input.nextLine();//User input
		input.close();
		if (user.equals(cpu)){
			System.out.print("The game is a tie");
			System.out.println("\n" + cpu);
		}//This determines if the user and cpu are tied
		else if ((user.equals("Scissors") && cpu.equals("Paper") || (user.equals("Paper") && cpu.equals("Rock") || (user.equals("Rock") && cpu.equals("Scissors"))))){
			System.out.print("You win");
			System.out.println("\n" + cpu);
		}//This determines if you win the game
		else{
			System.out.print("You lose");
			System.out.println("\n" + cpu);
		}//This determines if you lose the game
	}

}


