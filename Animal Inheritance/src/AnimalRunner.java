
public class AnimalRunner
	{

		public static void main(String[] args)
			{
				System.out.println("Welcom to the Animal Kingdom \n");
				Animal biome[] = {new Bat(), new DodoBird(), new Dog(), new Eagle(), new Penguin(), new Platypus()};
				for(int i = 0; i < 6; i++)
					{
						System.out.println(biome[i].name);
						biome[i].bearsYoung();
						biome[i].makeNoise();
						biome[i].eat();
						biome[i].myFly.fly();
						System.out.println();
					}
			}

	}
