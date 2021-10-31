
// Acha Question h isme kai chz seekhne ko mili h 
/*  This problem can be solved with the help of heap.
First sort all events by start time. If start time of two events are equal, sort them by end time.
Then take a priority queue that takes an array containing [endtime, value]. Priority queue will sort elements on the basis of end time.
Iterate through events, for each event e, calculate maximum value from all events that ends before e[0] (i.e. start time). Let's store this value in maxVal variable.
Now answer will be ans = max(ans, e[2] + maxVal).*/
    
    
    public int maxTwoEvents(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->a[0]==b[0] ? a[1]-b[1]: a[0]-b[0]);
        PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->a[0]-b[0]); // yha Array ka size 2 h end usme end,value ye do data jyga.
         int maxVal = 0, ans = 0;
        for(int[] e : arr){            
            int start = e[0];
            while(!queue.isEmpty()){
                if(queue.peek()[0] >= start)
                    break;
                int[] eve = queue.remove();
                maxVal = Math.max(maxVal, eve[1]);
            }
            ans = Math.max(ans, e[2] + maxVal);
            queue.add(new int[]{e[1], e[2]});
        }
        
        return ans;
    }