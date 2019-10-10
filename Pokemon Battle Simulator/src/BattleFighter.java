import java.util.Scanner;

public class BattleFighter
	{

		public static void fightBattle()
			{

				boolean stillFighting = true;
				System.out.println("You will be fighting " + OpponentPokemonMaker.EnemyPokemon
						.get(OpponentPokemonMaker.randomNumberPokemon).getOpponentName());
				while (stillFighting)
					{
						
						if(MyPokemon.getHitPoints() <= 0)
							{
								System.out.println("The battle has ended...");
								
								System.out.println("You lose. " + OpponentPokemonMaker.EnemyPokemon
										.get(OpponentPokemonMaker.randomNumberPokemon).getOpponentName() + " wins.");
								stillFighting = false;
							}
						if(OpponentPokemon.getOpponentHitPoints() <= 0)
							{
								System.out.println("The battle has ended...");
								System.out.println("You win " + MyPokemonMaker.MyPokemon.get(RandomPokemonGenerator.starterChoice).getName() + ".");
								stillFighting = false;
							}
						

					}
			}

	}
