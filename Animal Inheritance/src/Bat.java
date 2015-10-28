
public class Bat extends Mammal
	{

		public Bat()
			{
				name = "Bat";
				food = "insects";
				noise = "ultrasonic pulse";
				myFly = (FlyingBehavior) new CanFly();
			}
		public void makeNoise()
			{
				System.out.println("The " + name + " emits an *" + noise + "*");
			}

	}
