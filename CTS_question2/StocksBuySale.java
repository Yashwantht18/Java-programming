class StocksBuySale{
	public static void main(String args[]){
		int minPrice = Integer.MAX_VALUE;
    		int maxProfit = 0;
		int[] prices = {1,6,2};
		for (int price : prices) {
        		if (price < minPrice) {
            			minPrice = price;
        		} 
			else if (price - minPrice > maxProfit) {
            			maxProfit = price - minPrice;
        		}
    		}
		System.out.println((maxProfit == 0)? "Ratan never bought!" : maxProfit);
	}
}