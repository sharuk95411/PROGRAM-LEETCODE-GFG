 // Logic and Question Explanation from Knowlegde Centre and TYNT
    public int leastInterval(char[] tasks, int n) {
    
        HashMap<Character,Integer>h= new HashMap<>();
        for(int i=0; i<tasks.length;i++)
        {
            h.put(tasks[i], h.getOrDefault(tasks[i],0)+1);
        }
        PriorityQueue<Integer>pq= new PriorityQueue<>(h.size(),Collections.reverseOrder());
        pq.addAll(h.values());
        
        int ans=0;
        
        while(pq.size()>0)
        {
            List<Integer>list= new ArrayList<>();
            
            int time=0;
            for(int i=0;i<n+1;i++)
            {
                if(pq.size()>0)
                {
                    list.add(pq.poll()-1);
                    time++;
                }
            }
            for(int c : list)
            {
                if(c>0) pq.add(c);
            }
            ans+= pq.size()==0 ? time :n+1;
            
        }
        
        
        return ans;
  
        
    }