import java.util.Scanner;

public class RandomPokemonGenerator
	{

		public static void main(String[] args)
			{
				Scanner strInput = new Scanner(System.in);
				System.out.println("Tell me your name");
				String userName = strInput.nextLine();
				System.out.println(
						"Greetings traveller! My name is Professor Mozzi, and I am here to gift you a random starter pokemon!");

				String[][] Pokemon =
					{
							{ "Chimchar", "Piplup", "Turtwig" },
							{ "20", "35", "40" },
							{ "Fire", "Water", "Grass" },
							{ "56", "38", "45" },
							{ "25", "35", "50" } };

				// NAME
				// HP
				// TYPE
				// ATTACK DMG
				// DEFENSE

			}

	}
