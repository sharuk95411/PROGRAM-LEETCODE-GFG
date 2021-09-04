 public static ArrayList<Integer> arrangeGame(ArrayList<Integer> arr)
    {
        int n= arr.size();
         ArrayList<Integer>l= new ArrayList<>();
        int ones=0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==1)
            {
                ones++;
                l.add(1);
            }
           
        }
        Collections.sort(arr,Collections.reverseOrder());
        if(ones+2==n && (arr.get(0)==3 &&arr.get(1)==2)) 
           {
            l.add(2);
               l.add(3);
               return l;
           }
           else
           {
               for(int i=0;i<n-ones;i++)
               {
                   l.add(arr.get(i));
               }
           }
           return l;