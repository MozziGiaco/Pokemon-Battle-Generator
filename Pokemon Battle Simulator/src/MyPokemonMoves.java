import java.util.ArrayList;

public class MyPokemonMoves
	{
		static ArrayList<MyMoveSet> MyPokemonMoves = new ArrayList<MyMoveSet>();

		public static void loadMoveData()
			{
				int randomNumber = (int) (Math.random() * 10 + 90);

				MyPokemonMoves.add(new MyMoveSet("Flamethrower", randomNumber));
				MyPokemonMoves.add(new MyMoveSet("Surf", randomNumber));
				MyPokemonMoves.add(new MyMoveSet("Earthquake", randomNumber));

				System.out.println(MyPokemonMoves.get(2).getMovePower());
			}

	}

// Notes: move power = subtract pokemon hp
// make another constructor for opponent moves and power
// test print code to see if it all works
