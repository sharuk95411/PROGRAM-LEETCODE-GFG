 String secFrequent(String arr[], int N)
    {
        if(N==0) return "";
        if(N==1) return arr[0];
    HashMap<String,Integer>h= new HashMap<>();
    
    for(int i=0;i<N;i++)
    {
        h.put(arr[i],h.getOrDefault(arr[i],0)+1 );
    }
    
// Ab Niche HashMap ko uske values k base pr descending order me sort kr dia gya h
PriorityQueue<Map.Entry<String,Integer>>pq= new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue());
for(Map.Entry<String, Integer> entry: h.entrySet())// h is Object of HashMap
        {
            pq.offer(entry);
            
        }
       if(pq.size()==1) return pq.peek().getKey();
       else
       {
           pq.poll();
           return pq.peek().getKey();
       }
    }