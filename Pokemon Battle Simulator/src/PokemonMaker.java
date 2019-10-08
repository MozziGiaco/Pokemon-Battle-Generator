import java.util.ArrayList;

public class PokemonMaker
	{
		static ArrayList<Pokemon> MyPokemon = new ArrayList<Pokemon>();

		public static void main(String[] args)
			{

			}

		public static void loadData()
			{
				MyPokemon.add(new Pokemon("Chimchar", 500, "Fire"));
				MyPokemon.add(new Pokemon("Piplup", 450, "Water"));
				MyPokemon.add(new Pokemon("Turtwig", 550, "Grass"));

			}

	}
