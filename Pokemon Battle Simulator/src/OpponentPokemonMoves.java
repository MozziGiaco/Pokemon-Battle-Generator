import java.util.ArrayList;

public class OpponentPokemonMoves
	{
		static ArrayList<OpponentMoveSet> EnemyMoves = new ArrayList<OpponentMoveSet>();

		public static void loadOpponentPokemonMoves()
			{
				int randomNumber = (int) (Math.random() * 10 + 10);
				int randomNumber1 = (int) (Math.random() * 10 + 30);
				int randomNumber2 = (int) (Math.random() * 10 + 70);
				int randomNumber3 = (int) (Math.random() * 10 + 150);

				// (easy)
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				EnemyMoves.add(new OpponentMoveSet("Scratch", randomNumber));
				// (medium)
				EnemyMoves.add(new OpponentMoveSet("Rock Blast", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Shadow Ball", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Electric Shock", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Rock Blast", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Stomp", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Thunderbolt", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Mach Punch", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Surf", randomNumber1));
				EnemyMoves.add(new OpponentMoveSet("Flamethrower", randomNumber1));
				// (almost impossible)
				EnemyMoves.add(new OpponentMoveSet("Ancient Power", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Dragon Claw", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Fire Blast", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Dragon Claw", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Earthquake", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Inferno", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Surf", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Close Combat", randomNumber2));
				EnemyMoves.add(new OpponentMoveSet("Hyper Drain", randomNumber2));
				// (impossible)
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));
				EnemyMoves.add(new OpponentMoveSet("Hyper Beam", randomNumber3));

			}

	}
