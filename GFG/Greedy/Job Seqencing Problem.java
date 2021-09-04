class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
  PriorityQueue<Job> pq = new PriorityQueue<>((p1, p2) -> p2.profit - p1.profit);
  for(int i=0;i<n;i++)
  {
      pq.add(arr[i]);
  }
  Arrays.sort(arr,(a,b)-> b.deadline -a.deadline );// isko isliye sort kia h ki maximun waiting time mil           
sake jo ki abdul bari me btaya h and iska pattern same PQ ki trh h to ye b nai chz seekhi h isme
  Job j= arr[0];// its gives the maximun waiting time 
  int a1[]= new int[j.deadline];
  int p=0;
  int job=0;
  
  Job obj= pq.poll();
  p=obj.profit;
  job++;
  int end= obj.deadline;
   a1[end-1]= p;
  
  while(pq.size()>0)
  {
    obj= pq.poll();
    end= obj.deadline;
    for(int k=end-1;k>=0;k--)
    {
        if(a1[k]==0) 
        {
            job++;
            p=p+obj.profit;
            a1[k]=obj.profit;
            break;
        }
    }
     
  }
  int a[]= {job,p};
  return a;
  
  
  
  
    }
}