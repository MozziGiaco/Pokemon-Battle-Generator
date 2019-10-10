import java.util.ArrayList;

public class OpponentPokemonMaker
	{
		static ArrayList<OpponentPokemon> EnemyPokemon = new ArrayList<OpponentPokemon>();
		static int randomNumberPokemon = (int) (Math.random() * EnemyPokemon.size());

		public static void loadOpponentPokemonData()
			{

				// (easy)
				EnemyPokemon.add(new OpponentPokemon("Rattata", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Pidgey", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Ponyta", 30, "Fire"));
				EnemyPokemon.add(new OpponentPokemon("Caterpie", 30, "Bug"));
				EnemyPokemon.add(new OpponentPokemon("Meowth", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Furret", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Eevee", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Raticate", 30, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Sentret", 30, "Normal"));
				// (medium)
				EnemyPokemon.add(new OpponentPokemon("Onix", 80, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Haunter", 80, "Ghost"));
				EnemyPokemon.add(new OpponentPokemon("Electrode", 80, "Electric"));
				EnemyPokemon.add(new OpponentPokemon("Rhyhorn", 80, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Kangaskhan", 80, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Electabuzz", 80, "Electric"));
				EnemyPokemon.add(new OpponentPokemon("Kabutops", 80, "Fighting"));
				EnemyPokemon.add(new OpponentPokemon("Lapras", 80, "Water"));
				EnemyPokemon.add(new OpponentPokemon("Magmar", 80, "Fire"));
				// (hard)
				EnemyPokemon.add(new OpponentPokemon("Rhyperior", 150, "Rock"));
				EnemyPokemon.add(new OpponentPokemon("Dragonite", 150, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Salamence", 150, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Garchomp", 150, "Dragon"));
				EnemyPokemon.add(new OpponentPokemon("Snorlax", 150, "Normal"));
				EnemyPokemon.add(new OpponentPokemon("Charizard", 150, "Fire"));
				EnemyPokemon.add(new OpponentPokemon("Blastoise", 150, "Water"));
				EnemyPokemon.add(new OpponentPokemon("Machamp", 150, "Fighting"));
				EnemyPokemon.add(new OpponentPokemon("Venusaur", 150, "Grass"));
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
