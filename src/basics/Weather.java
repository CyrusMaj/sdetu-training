package basics;

public class Weather 
{
	public static void main(String[] args)
	{
		//This program will give suggestions on what to wear based on the temperature and sun condidtion.
		
		int temperature = 70;
		String sunCondition = "Sunny";
		
		if (temperature > 80)
		{
			System.out.println("It's nice out, wear shorts and a t-shirt.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny"))
		{
			System.out.println("It's cooler, wear a sweatshirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else
		{
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
	}
}
