import java.util.ArrayList;

public class PokemonMoves
	{
		static ArrayList<MoveSet> MyPokemonMoves = new ArrayList<MoveSet>();

		public static void main(String[] args)
			{

			}

		public static void loadMoveData()
			{
				MyPokemonMoves.add(new MoveSet("Flamethrower", 95));
				MyPokemonMoves.add(new MoveSet("Surf", 95));
				MyPokemonMoves.add(new MoveSet("Earthquake", 100));
			}

	}

// Notes: move power = subtract pokemon hp
// make another constructor for opponent moves and power
// test print code to see if it all works
