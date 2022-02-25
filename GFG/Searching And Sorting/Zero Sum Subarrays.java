pepcoding, LOGIC HasmPap and prefix sum and its very easy
public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Long>h= new HashMap<>();
        h.put(Long.valueOf(0),Long.valueOf(1));
    long count =0;
      long sum=0;
    for(int i=0;i<n;i++)
    {
        sum= sum+arr[i];
        if(h.containsKey(sum)==true)
        {
            count= count+h.get(sum);
            h.put(sum,h.get(sum)+1);
        }
        else
        {
        
        h.put(sum,Long.valueOf(1));
        }
       // if(arr[i]==0 && i!=0) count++;
       
    }
    return (count);
    }