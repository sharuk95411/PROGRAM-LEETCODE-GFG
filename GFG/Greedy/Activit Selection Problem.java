
class Solution 
{
    static class Pair
{
    int a,b;
    Pair(int a,int b)
    {
        this.a= a;
        this.b=b;
    }
}
   
    public static int maxMeetings(int s[], int f[], int n)
    {
 PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.a - p2.a); // sort in increasing order
// PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p2.a - p1.a); // sort in decreasing order
  for(int i=0;i<n;i++)
  {
      p.add(new Pair(f[i],s[i]));
  }
  ArrayList<Pair>ans= new ArrayList<>();
  
  Pair obj= p.poll();
  int finish= obj.a;
  int start= obj.b;
  int end= finish;
  ans.add(new Pair(start,end));
  while(p.size()>0)
  {
      obj= p.poll();
      if(obj.b>end)
      {
          ans.add(new Pair(obj.b,obj.a));
          end= obj.a;
      }
  }
  return ans.size();
    }
}
