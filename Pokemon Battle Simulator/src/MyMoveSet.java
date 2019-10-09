public class MyMoveSet
	{
		private static String MoveName;
		private static int MovePower;

		public MyMoveSet(String mn, int mp)
			{
				MoveName = mn;
				MovePower = mp;
			}

		public static String getMoveName()
			{
				return MoveName;
			}

		public static void setMoveName(String moveName)
			{
				MoveName = moveName;
			}

		public static int getMovePower()
			{
				return MovePower;
			}

		public static void setMovePower(int movePower)
			{
				MovePower = movePower;
			}

	}