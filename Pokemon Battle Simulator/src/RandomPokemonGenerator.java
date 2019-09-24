import java.util.Scanner;

public class RandomPokemonGenerator {
	static String strInput;
	static int intInput;

	public static void generatePokemon() {
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);

		System.out.println("Tell me your name...");
		String userName = strInput.nextLine();

		System.out.println(
				"Greetings " + userName + ". My name is Professor Mozzi, and I am here to gift you a starter Pokemon!");

		System.out.println("Before we get to that, do you know anything about Pokemon?");

		System.out.println("(1) Yes");
		System.out.println("(2) No");

		int pokemonKnowledge = intInput.nextInt();

		if (pokemonKnowledge == 1) {
			System.out.println("Terrific! Then we are ready to begin!");
		} else {
			System.out.println("Let me give you a quick summary of what Pokemon is all about!");
			delayCode(4);
			System.out.println(
					"Pokemon is a game where you choose a starter Pokemon, and go on endless adventures to level up your Pokemon and to catch other Pokemon as well...");
			delayCode(4);
			System.out.println("");
			System.out.println(
					"There are many different types of Pokemon, and depending on what type of Pokemon you have, you will be at an advantage or disadvantage in battle...");
			delayCode(4);
			System.out.println("");
			System.out.println("Strategizing in battle is the most important factor in winning a battle...");
			delayCode(4);
			System.out.println("");
			System.out.println(
					"In the end, the goal in playing Pokemon is to become the best trainer you can be, and to try and catch all of the other Pokemon!");
			delayCode(4);
			System.out.println("");
			System.out.println(
					"Now that you have a general understanding of what Pokemon is and how to play it, let's choose your starter Pokemon!");
			delayCode(3);

		}
	}

	public static void givePokemon() {
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		delayCode(2);

		String[][] Pokemon = { { "Charmander", "Squirtle", "Bulbasaur" }, { "30 HP", "35 HP", "40 HP" },
				{ "Fire", "Water", "Grass" }, { "56 ATT", "38 ATT", "45 ATT" }, { "30 DEF", "35 DEF", "50 DEF" } };

		System.out.println("");
		System.out.println("Here are the three starter Pokemon you may choose from...");
		System.out.println("");
		for (int row = 0; row < Pokemon.length; row++) {
			for (int col = 0; col < Pokemon[row].length; col++) {
				System.out.printf("%-12s", Pokemon[row][col]);
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("Please choose which starter Pokemon you would like to have...");
		System.out.println("");
		System.out.println("(1) Charmander");
		System.out.println("(2) Squirtle");

		System.out.println("(3) Bulbasaur");

		int starterChoice = intInput.nextInt();

		System.out.println("I'm sure you will be happy with this Pokemon!");
	}

	public static void delayCode(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
