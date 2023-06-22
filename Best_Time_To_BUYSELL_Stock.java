import java.util.Stack;

public class Best_Time_To_BUYSELL_Stock {
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        int profit = 0;
        int max = 0;
       int lowest = arr[0];

        for(int i =1;i<arr.length;i++)
        {

            if(arr[i]<lowest)
            {
               lowest = arr[i];
            }
            else {

                profit = arr[i] - lowest;
                if(profit>max)
                {
                    max = profit;
                }
            }

        }
        System.out.println(max);
    }

}
