
public class MyPokemon

	{
		private static String Name;
		private static int HitPoints;
		private static String Type;

		public MyPokemon(String n, int hp, String t)
			{
				Name = n;
				HitPoints = hp;
				Type = t;
			}

		public static String getName()
			{
				return Name;
			}

		public static void setName(String name)
			{
				Name = name;
			}

		public static int getHitPoints()
			{
				return HitPoints;
			}

		public static void setHitPoints(int hitPoints)
			{
				HitPoints = hitPoints;
			}

		public static String getType()
			{
				return Type;
			}

		public static void setType(String type)
			{
				Type = type;
			}

	}
