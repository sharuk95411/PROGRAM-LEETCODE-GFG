// logic Coded Decoded
    // TC O(n2) and SC O(n);
    // Queue Used 
    public int findTheWinner(int n, int k) {
        
        Queue<Integer>  q= new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            q.add(i);
        }
        while(q.size()!=1)
        {
            for(int j=1;j<k;j++)
            {
                q.add(q.poll());
            }
            q.poll();
        }
        return q.poll();
    }