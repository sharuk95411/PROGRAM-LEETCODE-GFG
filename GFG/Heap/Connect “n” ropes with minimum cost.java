 long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        pq.add(arr[i]);
        long cost=0;
        while(pq.size()>1){
            Long a=pq.poll();
            Long b=pq.poll();
            cost+=(a+b);
            pq.add(a+b);
        }
    return(cost);
    }