import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Team 13 Top Trumps");
		String mode = "";
		while(!(mode.equals("play") || mode.equals("stats")))
		{
			System.out.println("Enter 'play' to start a new game. Enter 'stats' to view game history");
			mode = scanner.next();
		}
		//closing the scanner here seems to prevent other scanners from being opened properly
		//scanner.close();
		if(mode.equals("play"))
		{
			new Game().start();;
		}	
	}
}