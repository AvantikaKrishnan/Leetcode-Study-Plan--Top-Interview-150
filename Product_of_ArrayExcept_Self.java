import java.util.Stack;

public class Product_of_ArrayExcept_Self {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        int temp = 1;
        int l = nums.length;
        int ans[] = new int[l];
        int prefix[] = new int[l];
        prefix[0] = 1;
        for(int i =1;i<l;i++)  //PREFIX SUFFIX CONCEPT
        {
            prefix[i] = prefix[i-1]*nums[i-1];

        }

        for(int i =l-1;i>=0;i--)
        {
            ans[i] = temp*prefix[i];
            temp *= nums[i];
        }

        for(int i =0;i<l;i++)
            System.out.print(ans[i]+" ");

    }
}
