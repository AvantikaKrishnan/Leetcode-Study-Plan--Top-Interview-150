public class Rotate_Array {
    public static void main(String[] args) {
        int nums[] = {1,2};
        int k = 3;

        int l = nums.length;
        int n = k%l; //For cases where the rotation is greater than length of array
        if(l != 1)
        {
            nums = helper(nums,0,l-n-1);
            nums = helper(nums,l-n,l-1);
            nums = helper(nums,0,l-1);
        }

        for(int i =0;i<l;i++)
        {
            if(i == 0)
                System.out.print("[" + nums[i] +",");
            else if(i == l-1)
                System.out.print(nums[i]+ "]");
            else

            System.out.print(nums[i] + ",");
        }


    }
    public static int[] helper(int nums[] , int start, int end)
    {
        while(start<=end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
