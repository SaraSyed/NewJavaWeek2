
public class BlackJack {
	
	public int blackjack(int a, int b)
	{
		if(a > 21)
		{
			if(b > 21)
				return 0;
			return b;
		}
		if(a < b && b <= 21)
			return b;
		return a;
	}

}
