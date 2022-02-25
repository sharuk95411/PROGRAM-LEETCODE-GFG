  List<Integer>inner= new ArrayList<>();
        List<List<Integer>>outer= new ArrayList<>();
        Arrays.sort(arr);
        int min= Integer.MAX_VALUE;
        int n= arr.length;
        for(int i=1;i<n;i++)
        {
            min= Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        
        for(int i=1;i<n;i++)
        {
            int diff= Math.abs(arr[i]-arr[i-1]);
            if(diff==min)
            {
                inner.add(arr[i-1]);
                inner.add(arr[i]);
                outer.add(new ArrayList<>(inner));
                inner.clear();
            }
        }
        return outer;