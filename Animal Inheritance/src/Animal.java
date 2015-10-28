
public abstract class Animal
	{
		protected String name;
		protected String food;
		protected String noise;
		protected FlyingBehavior myFly;
		
		protected void makeNoise()
			{
				System.out.println("The " + name + " says, *" + noise + "*");
			}
		protected abstract void bearsYoung();
		protected void eat()
			{
				System.out.println("It is excited to eat " + food + ".");
			}
	}
