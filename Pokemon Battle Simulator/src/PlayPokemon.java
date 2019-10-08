
public class PlayPokemon
	{

		public static void main(String[] args)
			{
				RandomPokemonGenerator.generatePokemon();
				RandomPokemonGenerator.givePokemon();
				CityDestination.showCityPokemon();
				CityDestination.chooseCity();
				BattleGenerator.fightBattle();
			}

	}
