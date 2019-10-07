
public class Pokemon
	{
		public static String fuschiaPokemon;
		public static String lumiosePokemon;
		public static String cherrygrovePokemon;
		public static String olivinePokemon;

		public Pokemon(String f, String l, String c, String o)
			{
				fuschiaPokemon = f;
				lumiosePokemon = l;
				cherrygrovePokemon = c;
				olivinePokemon = o;
			}

		public static String getFuschiaPokemon()
			{
				return fuschiaPokemon;
			}

		public static void setFuschiaPokemon(String fuschiaPokemon)
			{
				Pokemon.fuschiaPokemon = fuschiaPokemon;
			}

		public static String getLumiosePokemon()
			{
				return lumiosePokemon;
			}

		public static void setLumiosePokemon(String lumiosePokemon)
			{
				Pokemon.lumiosePokemon = lumiosePokemon;
			}

		public static String getCherrygrovePokemon()
			{
				return cherrygrovePokemon;
			}

		public static void setCherrygrovePokemon(String cherrygrovePokemon)
			{
				Pokemon.cherrygrovePokemon = cherrygrovePokemon;
			}

		public static String getOlivinePokemon()
			{
				return olivinePokemon;
			}

		public static void setOlivinePokemon(String olivinePokemon)
			{
				Pokemon.olivinePokemon = olivinePokemon;
			}
	}
