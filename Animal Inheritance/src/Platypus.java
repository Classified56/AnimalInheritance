
public class Platypus extends Mammal
	{

		public Platypus()
			{
				name = "Platypus";
				food = "shrimp";
				noise = "growl";
				myFly = (FlyingBehavior) new CannotFly();
			}
		public void bearsYoung()
			{
				System.out.println("Ooo, what a cute little mammal egg!");
			}

	}
