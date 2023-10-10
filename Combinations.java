 public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans= new ArrayList<>();
      List<Integer> p = new ArrayList<>();
      return helper(n,k, 1, p ,ans);
        
    }

    public List<List<Integer>> helper(int n,int k,int c, List<Integer> p, List<List<Integer>> ans)
    {
        if(k == 0)
        {
            ans.add(new ArrayList(p));
            return ans;

        }

        else
        {
            while(c<=n)
            {
                p.add(c++);
                 helper(n,k-1,c,p,ans);
                p.remove(p.size()-1);
            }
        }
        return ans;
    }
