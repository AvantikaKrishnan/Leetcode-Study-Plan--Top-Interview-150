class RandomizedSet {
           ArrayList<Integer> list;;
    public RandomizedSet() {
        list = new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
        if(list.contains(val))
        {
            return false;
        }
        else
        {
            list.add(val);
            return true;
        }
        
       
    }
    
    public boolean remove(int val) {
        if(list.contains(val))
        {
            for(int i =0;i<list.size();i++)
            {
                if(list.get(i) == val)
                {
                list.remove(i);
                break;
                }
            }
            return true;
        }
        else
        return false;
    }
    
    public int getRandom() {
         int index = (int)(Math.random() * list.size());
         return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
