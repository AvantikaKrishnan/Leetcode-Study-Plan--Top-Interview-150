public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(helper(arr));
    }
    public static int helper(int nums[]) //Boyer-Moore Voting Algorithm
    {
        int l = nums.length;
        int count = 0;
        int e =0;
        for(int i = 0 ;i<l;i++)
        {
            if(count == 0)
            {
                e = nums[i];
            }
            if(nums[i] == e)
                count++;
            else
                count--;
        }
        return e;
    }
}

