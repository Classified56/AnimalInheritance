
public class Bat extends Mammal
	{

		public Bat()
			{
				name = "Bat";
				food = "insects";
				noise = "ultrasonic pulse";
			}
		public void makeNoise()
			{
				System.out.println("The " + name + " emits an *" + noise + "*");
			}

	}
