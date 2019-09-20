import java.util.Scanner;

public class CityDestination {
	static String strInput;
	static int intInput;

	public static void showCityPokemon() {
		System.out.println(
				"Now that you have received your Pokemon, you need to choose a city to start your pokemon journey...");

		System.out.println("But be careful! Some cities contain more challenging Pokemon than others...");

		System.out.println("");
		System.out.println(
				"I'm sure you are wondering what kind of Pokemon you might see in each city...let me show you!");

		System.out.println("The Pokemon in each city correspond with the difficulty level of each city.");
		System.out
				.println("If the difficulty of the city is lower, the Pokemon will be less powerful, and vise versa.");
		System.out.println("Press enter to show the Fuchsia City Pokemon");
		System.out.println("");

		System.out.println("In Fuchsia City, you might find Pokemon like...");
		System.out.println("");

		String[][] FuchsiaPokemon = { { "Rattata", "Pidgey", "Ponyta" }, { "Caterpie", "Meowth", "Furret" },
				{ "Eevee", "Raticate", "Sentret" }, };

		for (int row = 0; row < FuchsiaPokemon.length; row++) {
			for (int col = 0; col < FuchsiaPokemon[row].length; col++) {
				System.out.printf("%-12s", FuchsiaPokemon[row][col]);
				delayCode(1);
			}

			System.out.println();
		}
		System.out.println("And many more!");
		delayCode(1);
		System.out.println("Press enter to show the Lumiosa City Pokemon");

		System.out.println("");
		System.out.println("In Lumiosa City, you might find Pokemon like...");

		String[][] LumiosaPokemon = { { "Onix", "Haunter", "Electrode" }, { "Rhyhorn", "Kangaskhan", "Electabuzz" },
				{ "Kabutops", "Lapras", "Magmar" }, };

		for (int row = 0; row < LumiosaPokemon.length; row++) {
			for (int col = 0; col < LumiosaPokemon[row].length; col++) {
				System.out.printf("%-12s", LumiosaPokemon[row][col]);
				delayCode(1);
			}

			System.out.println();
		}
		System.out.println("And many more!");
		delayCode(1);
		System.out.println("Press enter to show the Cherrygrove City Pokemon");

		System.out.println("");
		System.out.println("In Cherrygrove City, you might find Pokemon like...");

		String[][] CherrygrovePokemon = { { "Rhyperior", "Dragonite", "Salamence" },
				{ "Garchomp", "Snorlax", "Charizard" }, { "Blastoise", "Machamp", "Venusaur" }, };

		for (int row = 0; row < CherrygrovePokemon.length; row++) {
			for (int col = 0; col < CherrygrovePokemon[row].length; col++) {
				System.out.printf("%-12s", CherrygrovePokemon[row][col]);
				delayCode(1);
			}

			System.out.println();
		}
		System.out.println("And many more!");
		delayCode(1);
		System.out.println("Press enter to show the Olivine City Pokemon");

		System.out.println("");
		System.out.println("And finally, in Olivine City, you might find Pokemon like...");

		String[][] OlivinePokemon = { { "Mew", "Mewtwo", "Groudon" }, { "Kyogre", "Rayquaza", "Dialga" },
				{ "Palkia", "Gyratina", "Arceus" }, };

		for (int row = 0; row < OlivinePokemon.length; row++) {
			for (int col = 0; col < OlivinePokemon[row].length; col++) {
				System.out.printf("%-12s", OlivinePokemon[row][col]);
				delayCode(1);
			}

			System.out.println();
		}
		System.out.println("And many more! (They're all legendaries, if you couldn't tell...)");

		delayCode(1);

	}

	public static void chooseCity() {
		System.out.println("");
		System.out.println("Now that you have seen all of the Pokemon you may encounter in each city...");
		System.out.println("");
		System.out.println("Please choose one city to travel to...");
		System.out.println("");
		System.out.println("(1) Fuchsia City (Low Difficulty)");
		System.out.println("(2) Lumiosa City (Medium Difficulty)");
		System.out.println("(3) Cherrygrove City (High Difficulty)");
		System.out.println("(4) Olivine City (Very High Difficulty)");
		chooseCityCode();
	}

	public static void chooseCityCode() {
		Scanner intInput = new Scanner(System.in);

		int cityChoice = intInput.nextInt();
		if (cityChoice == 1) {

			System.out.println("Great choice! That's a smart decision for a rookie trainer...");

		} else if (cityChoice == 2) {
			System.out.println("Awesome choice! I see you are a trainer that is ready to battle...");
		} else if (cityChoice == 3) {
			System.out.println("Wow! I see fire in your eyes ready to take on the world...");

		} else if (cityChoice == 4) {
			System.out.println("Unbelievable! You are truly an extraordinary trainer filled with ambition...");
		} else {
			System.out.println("That is not one of the options I gave you...please choose again.");
			chooseCity();
		}

		System.out.println("Okay trainer...");
		delayCode(3);
		System.out.println(
				"You have your starter Pokemon, and you know what kind of Pokemon you may encounter on your journey...");
		delayCode(3);
		System.out.println("Are you ready to begin?");
		System.out.println("(1) Yes");
		System.out.println("(2) No");

		int journeyDecision = intInput.nextInt();

		if (journeyDecision == 1) {
			System.out.println("Terrific! Let's go!");
		} else {
			System.out.println("You've already come this far, there's no escape now. Let's go!");
		}

	}

	public static void delayCode(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}