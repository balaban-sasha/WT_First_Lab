package Task_9;

public class Ball {
	private int weight;
	private String color;
	public Ball(int weight, String color) {
		if(weight<0)
			throw new IllegalArgumentException("Weight can't be lower than 0");
		this.weight=weight;
		this.color=color;
	}
	public int getBallWeight()
	{
		return this.weight;
	}
	public String getBallColor()
	{
		return this.color;
	}
}
