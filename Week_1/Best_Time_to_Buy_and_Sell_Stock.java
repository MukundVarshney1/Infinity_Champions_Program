package Week_1;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BruteForce tc:-O(n**2)
		
//		int[] prices = {7, 1, 5, 3, 6, 4};
//		int ans=0;
//		for(int i=0;i<prices.length;i++) {
//			for(int j=i+1;j<prices.length;j++) {
//				ans=Math.max(ans, prices[j]-prices[i]);
//			}
//		}
//		System.out.println(ans);
		
//		Optimal tc:-O(n)
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		int buy=prices[0];
		int ans=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<buy) {
				buy=prices[i];
			}
			ans=Math.max(ans, prices[i]-buy);
		}
		System.out.println(ans);
		
	}

}
