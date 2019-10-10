import java.util.ArrayList;

public class MyPokemonMaker
	{
		static ArrayList<MyPokemon> MyPokemon = new ArrayList<MyPokemon>();

		public static void main(String[] args)
			{

			}

		public static void loadMyPokemonData()
			{
				MyPokemon.add(new MyPokemon("Charmander", 50, "Fire"));
				MyPokemon.add(new MyPokemon("Squirtle", 50, "Water"));
				MyPokemon.add(new MyPokemon("Bulbasaur", 50, "Grass"));

			}

	}
