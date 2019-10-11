import java.util.Scanner;

public class MoreFighting
	{

		public static void chooseBattle()
			{
				System.out.println("You have encountered a wild Pokemon, would you like to...");
				delayCode(2);
				System.out.println("(1) Fight");
				System.out.println("or...");
				System.out.println("(2) Run");
				Scanner intInput = new Scanner(System.in);
				int fightChoice = intInput.nextInt();

				if (fightChoice == 1)
					{
						fightBattle2();
					} else if (fightChoice == 2)
					{
						System.out.println("Okay trainer...good luck continuing on your journey!");
						System.exit(0);
					} else
					{
						System.out.println("That is not a choice I gave you...please choose again.");
						chooseBattle();
					}
			}

		public static void fightBattle2()
			{

				boolean stillFighting1 = true;

				System.out.println("Okay trainer...you will be fighting " + OpponentPokemonMaker.EnemyPokemon
						.get(OpponentPokemonMaker.randomNumberPokemon).getOpponentName());
				delayCode(2);
				System.out.println("You get the first move...let's begin!");
				delayCode(2);
				while (stillFighting1)
					{
						System.out.println(MyPokemonMaker.MyPokemon.get(RandomPokemonGenerator.starterChoice).getName()
								+ " used " + MyMoveSet.getMoveName() + " and dealt " + MyMoveSet.getMovePower()
								+ " damage!");

						delayCode(2);

						System.out
								.println(OpponentPokemonMaker.EnemyPokemon.get(OpponentPokemonMaker.randomNumberPokemon)
										.getOpponentName() + " used " + OpponentMoveSet.getOpponentMoveName()
										+ " and dealt " + OpponentMoveSet.getOpponentMovePower() + " damage!");

						delayCode(2);
					}
			}

		public static void delayCode(int sec)
			{
				try
					{
						Thread.sleep(sec * 1000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
	}
