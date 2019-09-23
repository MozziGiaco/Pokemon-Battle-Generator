
public class PlayPokemon
	{

		public static void main(String[] args)
			{
				RandomPokemonGenerator.generatePokemon();
				CityDestination.showCityPokemon();
				CityDestination.chooseCity();
				BattleGenerator.fightBattle();
			}

	}
