import java.util.ArrayList;

public class MyPokemonMaker
	{
		static ArrayList<MyPokemon> MyPokemon = new ArrayList<MyPokemon>();

		public static void main(String[] args)
			{

			}

		public static void loadData()
			{
				MyPokemon.add(new MyPokemon("Chimchar", 500, "Fire"));
				MyPokemon.add(new MyPokemon("Piplup", 450, "Water"));
				MyPokemon.add(new MyPokemon("Turtwig", 550, "Grass"));

			}

	}
