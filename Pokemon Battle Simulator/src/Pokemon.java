
public class Pokemon

	{
		public static String Name;
		public static int HitPoints;
		public static String Type;

		public Pokemon(String n, int hp, String t)
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
