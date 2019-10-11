
public class PlayPokemon
	{

		public static void main(String[] args)
			{

				RandomPokemonGenerator.generatePokemon();
				RandomPokemonGenerator.givePokemon();
				CityDestination.showCityPokemon();
				CityDestination.chooseCity();

				MyPokemonMaker.loadMyPokemonData();
				MyPokemonMoves.loadMoveData();
				OpponentPokemonMaker.loadOpponentPokemonData();
				OpponentPokemonMoves.loadOpponentPokemonMoves();
				MoreFighting.chooseBattle();
				BattleFighter.fightBattle();

			}

	}
