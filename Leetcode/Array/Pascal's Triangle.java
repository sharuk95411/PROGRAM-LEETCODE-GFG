 // badhya Question h TYN
    //logic- Codebix
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>>outer= new ArrayList<>();
        if(n==0) return outer;
          List<Integer>inner= new ArrayList<>();
        inner.add(1);
        
        outer.add(inner);
    
        
        
        for(int i=1;i<n;i++)
        {
        inner= new ArrayList<>();
            inner.add(1);
            for(int j=1;j<outer.size();j++)
            {
                inner.add(outer.get(i-1).get(j-1)+outer.get(i-1).get(j));
            }
            inner.add(1);
            outer.add(inner);
        }
        return outer;