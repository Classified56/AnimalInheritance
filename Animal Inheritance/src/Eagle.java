
public class Eagle extends Bird
	{

		public Eagle()
			{
				name = "Eagle";
				food = "freedom";
				noise = "screech";
				myFly = (FlyingBehavior) new CanFly();
			}

	}
