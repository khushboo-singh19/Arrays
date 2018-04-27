import java.util.Queue;
import java.util.Stack;

class Prices
{
	int buy; 
	int sell;
}
public class StockBuySell {
	
	public static void main(String args[])
	{
		int[] input={100, 180, 260, 310, 40, 535, 695, 65};
		StockBuySell s=new StockBuySell();
		s.findPrices(input);
	}

	private void findPrices(int[] input) {
		int l=input.length;
		Stack<Prices> prices = new Stack<Prices>();
		Prices[] price=new Prices[l/2];
		int i=0;
		int a=0;
		while(i<l-1)
		{	
			price[a]= new Prices();
			if(input[i]<input[i+1] && i<l-1)
			{
				price[a].buy=input[i];
			}
			while(i<l-1&& input[i]<input[i+1])
			{
				i++;
			}
			if(input[i]>input[i-1])
			{
			price[a].sell=input[i];
			i++;
			}
			prices.add(price[a]);
			a++;
		}
		int size=prices.size();
		for(i=0; i<size; i++)
		{
			Prices output=prices.pop();
			System.out.println(output.buy+ " "+ output.sell);
			
		}
	}
}
