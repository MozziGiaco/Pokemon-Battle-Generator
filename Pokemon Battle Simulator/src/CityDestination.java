import java.util.Scanner;

public class CityDestination
	{

		public static void chooseCity()
			{
				System.out.println(
						"Now that you have received your Pokemon, you need to choose a city to start your pokemon journey...");

				System.out.println("But be careful! Some cities contain more challenging Pokemon than others...");

				System.out.println("Please choose one city between these four...");
				System.out.println("");
				System.out.println("(1) Fuchsia City (Low Difficulty)");
				System.out.println("(2) Lumiosa City (Medium Difficulty)");
				System.out.println("(3) Cherrygrove City (High Difficulty)");
				System.out.println("(4) Olivine City (Very High Difficulty)");
				chooseCityCode();
			}

		public static void chooseCityCode()
			{
				Scanner intInput = new Scanner(System.in);

				int cityChoice = intInput.nextInt();
				if (cityChoice == 1)
					{

						System.out.println("Great choice! That's a smart decision for a rookie trainer...");

					}
				else if (cityChoice == 2)
					{
						System.out.println("Awesome choice! I see you are a trainer that is ready to battle...");
					}
				else if (cityChoice == 3)
					{
						System.out.println("Wow! I see fire in your eyes ready to take on the world...");

					}
				else if (cityChoice == 4)
					{
						System.out.println(
								"Unbelievable! You are truly an extraordinary trainer filled with ambition...");
					}
				else
					{
						System.out.println("That is not one of the options I gave you...please choose again.");
						chooseCity();
					}

			}

		public static void showCityPokemon()
			{
				System.out.println("");
				System.out.println(
						"Now, I'm sure you are wondering what kind of Pokemon you might see in each city...let me show you!");

				System.out.println("The Pokemon in each city correspond with the difficulty level of each city.");
				System.out.println(
						"If the difficulty of the city is lower, the Pokemon will be less powerful, and vise versa.");

				System.out.println("In Fuchsia City, you might find Pokemon like...");
				System.out.println("");

				String[][] FuchsiaPokemon =
					{
							{ "Rattata", "Pidgey", "Ponyta" },
							{ "Caterpie", "Meowth", "Furret" },
							{ "Eevee", "Raticate", "Sentret" }, };

				for (int row = 0; row < FuchsiaPokemon.length; row++)
					{
						for (int col = 0; col < FuchsiaPokemon[row].length; col++)
							{
								System.out.printf("%-12s", FuchsiaPokemon[row][col]);
								delayCode(5);
							}

						System.out.println();
					}

			}

		public static void delayCode(int sec)
			{
				try
					{
						Thread.sleep(sec * 1000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}

	}