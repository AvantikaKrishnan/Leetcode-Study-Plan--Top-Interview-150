class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        List<List<Integer>> c = new ArrayList<List<Integer>>();
        return helper(candidates, candidates.length,target,0,a,c,0);
    }
    public List<List<Integer>> helper(int arr[] , int n, int target, int sum, ArrayList<Integer> a, List<List<Integer>> c, int j)
    {
        if(sum == target)
        {
            c.add(new ArrayList(a));

        }
        else {
            for(int i =j;i<n;i++)
            {
                sum += arr[i];
                if(sum<=target){
                    a.add(arr[i]);
                    helper(arr,n,target,sum,a,c,i);
                    sum -= arr[i];
                    a.remove(a.size()-1);
                }
                else {
                    sum -= arr[i];
                    continue;
                }
            }
        }

        return c;
    }
}
