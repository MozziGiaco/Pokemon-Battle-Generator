
public class OpponentMoveSet
	{
		private static String OpponentMoveName;
		private static int OpponentMovePower;

		public OpponentMoveSet(String omn, int omp)
			{
				OpponentMoveName = omn;
				OpponentMovePower = omp;
			}

		public static String getOpponentMoveName()
			{
				return OpponentMoveName;
			}

		public static void setOpponentMoveName(String opponentMoveName)
			{
				OpponentMoveName = opponentMoveName;
			}

		public static int getOpponentMovePower()
			{
				return OpponentMovePower;
			}

		public static void setOpponentMovePower(int opponentMovePower)
			{
				OpponentMovePower = opponentMovePower;
			}

	}
