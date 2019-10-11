import java.util.ArrayList;

public class OpponentPokemonMaker
	{
		static ArrayList<OpponentPokemon> EnemyPokemon = new ArrayList<OpponentPokemon>();
		static int randomNumberPokemon = (int) (Math.random() * EnemyPokemon.size());

		public static void loadOpponentPokemonData()
			{

				// (easy)
				EnemyPokemon.add(new OpponentPokemon("Rattata", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Pidgey", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Ponyta", 50, "Fire"));
				EnemyPokemon.add(new OpponentPokemon("Caterpie", 50, "Bug"));
				EnemyPokemon.add(new OpponentPokemon("Meowth", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Furret", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Eevee", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Raticate", 50, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Sentret", 50, "Normal"));
				// (medium)
				EnemyPokemon.add(new OpponentPokemon("Onix", 100, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Haunter", 100, "Ghost"));
				EnemyPokemon.add(new OpponentPokemon("Electrode", 100, "Electric"));
				EnemyPokemon.add(new OpponentPokemon("Rhyhorn", 100, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Kangaskhan", 100, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Electabuzz", 100, "Electric"));
				EnemyPokemon.add(new OpponentPokemon("Kabutops", 100, "Fighting"));
				EnemyPokemon.add(new OpponentPokemon("Lapras", 100, "Water"));
				EnemyPokemon.add(new OpponentPokemon("Magmar", 100, "Fire"));
				// (almost impossible)
				EnemyPokemon.add(new OpponentPokemon("Rhyperior", 200, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Dragonite", 200, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Salamence", 200, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Garchomp", 200, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Snorlax", 200, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Charizard", 200, "Fire"));
				EnemyPokemon.add(new OpponentPokemon("Blastoise", 200, "Water"));
				EnemyPokemon.add(new OpponentPokemon("Machamp", 200, "Fighting"));
				EnemyPokemon.add(new OpponentPokemon("Venusaur", 200, "Grass"));
				// (impossible)
				EnemyPokemon.add(new OpponentPokemon("Mew", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Mewtwo", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Groudon", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Kyogre", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Rayquaza", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Dialga", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Palkia", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Gyratina", 300, "Legendary"));
				EnemyPokemon.add(new OpponentPokemon("Arceus", 300, "Legendary"));

			}

	}
