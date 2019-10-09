import java.util.ArrayList;

public class MyPokemonMoves
	{
		static ArrayList<MyMoveSet> MyPokemonMoves = new ArrayList<MyMoveSet>();

		public static void main(String[] args)
			{

			}

		public static void loadMoveData()
			{
				MyPokemonMoves.add(new MyMoveSet("Flamethrower", 95));
				MyPokemonMoves.add(new MyMoveSet("Surf", 95));
				MyPokemonMoves.add(new MyMoveSet("Earthquake", 100));
			}

	}

// Notes: move power = subtract pokemon hp
// make another constructor for opponent moves and power
// test print code to see if it all works
