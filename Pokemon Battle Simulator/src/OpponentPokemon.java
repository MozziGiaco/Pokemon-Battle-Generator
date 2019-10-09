
public class OpponentPokemon
	{
		private static String OpponentName;
		private static int OpponentHitPoints;
		private static String OpponentType;

		public OpponentPokemon(String on, int ohp, String ot)
			{
				OpponentName = on;
				OpponentHitPoints = ohp;
				OpponentType = ot;
			}

		public static String getOpponentName()
			{
				return OpponentName;
			}

		public static void setOpponentName(String opponentName)
			{
				OpponentName = opponentName;
			}

		public static int getOpponentHitPoints()
			{
				return OpponentHitPoints;
			}

		public static void setOpponentHitPoints(int opponentHitPoints)
			{
				OpponentHitPoints = opponentHitPoints;
			}

		public static String getOpponentType()
			{
				return OpponentType;
			}

		public static void setOpponentType(String opponentType)
			{
				OpponentType = opponentType;
			}

	}
