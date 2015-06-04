public class NameGame
{
	private String name;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] names = {"Lincoln", "Nick", "Arnold", "Billy", "Mary"};
		for(String n : names) {
			NameGame game = new NameGame(n);
			System.out.println(game.playGame());
		}
	}
	
	public NameGame(String n)
	{
		name = n;
	}
	
	public String playGame()
	{
		return name + ", " + name + " bo " + nameB(name) 
		+ ",\nBonana fanna fo " + nameF(name) + ",\nFee fy mo "
		+ nameM(name) + ",\n" + name + "!\n";
	}
	
	public static String nameB(String n)
	{
		if(n.substring(0,1).compareTo("B") == 0)
			return "Bo-" + n.substring(1);
		else if(!isVowel(n.substring(1,2))) 
			return "B" + n.toLowerCase();
		else
			return "B" + n.substring(1);
	}
	
	public static String nameF(String n)
	{
		if(n.substring(0,1).compareTo("F") == 0)
			return "Fo-" + n.substring(1);
		else if(!isVowel(n.substring(1,2))) 
			return "F" + n.toLowerCase();
		else
			return "F" + n.substring(1);
	}
	
	public static String nameM(String n)
	{
		if(n.substring(0,1).compareTo("M") == 0)
			return "Mo-" + n.substring(1);
		else if(!isVowel(n.substring(1,2))) 
			return "M" + n.toLowerCase();
		else
			return "M" + n.substring(1);
	}
	
	public static boolean isVowel(String n)
	{
		String[] vowels = {"a", "e", "i", "o", "u"};
		for(int i = 0; i < 5; i++)
		{
			if(vowels[i].compareTo(n) == 0)
				return true;
		}
		return false;
	}
	
}