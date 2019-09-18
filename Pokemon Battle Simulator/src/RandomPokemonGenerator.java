import java.util.Scanner;

public class RandomPokemonGenerator
	{

		public static void generatePokemon()
			{
				Scanner strInput = new Scanner(System.in);
				System.out.println("Tell me your name...");
				String userName = strInput.nextLine();
				System.out.println("Greetings " + userName
						+ ". My name is Professor Mozzi, and I am here to gift you a random starter pokemon from the first generation!");

				String[][] Pokemon =
					{
							{ "Charmander", "Squirtle", "Bulbasaur" },
							{ "30 HP", "35 HP", "40 HP" },
							{ "Fire", "Water", "Grass" },
							{ "56 ATT", "38 ATT", "45 ATT" },
							{ "30 DEF", "35 DEF", "50 DEF" } };

				System.out.println("");
				System.out.println("Here are the three starter pokemon...");
				System.out.println("");
				for (int row = 0; row < Pokemon.length; row++)
					{
						for (int col = 0; col < Pokemon[row].length; col++)
							{
								System.out.printf("%-12s", Pokemon[row][col]);
							}
						System.out.println();
					}
				System.out.println("");
				int randomNum = (int) (Math.random() * 3);

				System.out.println("Your random starter pokemon will be..." + Pokemon[0][randomNum]);

			}

	}
