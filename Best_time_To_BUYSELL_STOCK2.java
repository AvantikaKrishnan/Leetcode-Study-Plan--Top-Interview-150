public class Best_time_To_BUYSELL_STOCK2 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; // Test case
        int profit = 0;
        for(int i =prices.length-1;i>0;i--) //we see the problem in reverse
        {
            if(prices[i]>prices[i-1])
            {
                profit += prices[i]-prices[i-1];
            }
        }
        System.out.println(profit);

    }
}

