
public class Penguin extends Bird
	{

		public Penguin()
			{
				name = "Penguin";
				food = "fish";
				noise = "bray";
				myFly = (FlyingBehavior) new CannotFly();
			}

	}
