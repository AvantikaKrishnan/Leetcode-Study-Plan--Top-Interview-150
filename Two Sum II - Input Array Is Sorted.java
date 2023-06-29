class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int p1 =0;
        int p2=numbers.length-1;

        while(p1<p2)
        {
            if(numbers[p1]+numbers[p2] == target)
            {
                break;
            }
            else if(numbers[p1]+numbers[p2]>target)
            {
                p2--;
            }
            else
            {
                p1++;
            }
        }

        ans[0] = p1+1;
        ans[1] = p2+1;

        return ans;
        
    }
}
