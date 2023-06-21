public class Remove_Element {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(helper(nums,val));
    }
    public static int helper(int nums[], int val)
    {
        int l = nums.length;
        int s = l;
        int[] arr = new int[l];
        int i =0;
        for(int j =0;j<l;j++)
        {
            if(nums[j] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;

    }
}
