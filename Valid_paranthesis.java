class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        return helper(0,0,"", ans, n);
        
    }

    public List<String> helper(int r, int l, String s, List<String> ans, int n)
    {
        if(s.length() == n*2)
        {
            ans.add(s);
        }
        else
        {
            if(r< n)
            {
               
                helper(r+1,l,s+'(',ans,n);
               // s = s.substring(s.length()-1);
            }
            if(l<r)
            {
              
                helper(r,l+1, s+')',ans,n);
            }

        }

        return ans;
    }
}
