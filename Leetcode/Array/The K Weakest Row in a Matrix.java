// Isme PQ me condition ka use seekha h and This is BF isko phle khd se krna then Optimal pr jana
class Solution {
     class Node
    {
        int freq,row;
        Node(int row,int freq)
        {
            this.row= row;
            this.freq= freq;
        }
    }

  
    public int[] kWeakestRows(int[][] arr, int k) {
        int count=0;
 PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq == b.freq ?  a.row-b.row : a.freq-b.freq);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
            Node n= new Node(i,count);
pq.add(n);
            count=0;
        }
        
        int a[]= new int[k];
        for(int i=0;i<k;i++){
            Node n=(Node)pq.poll();
            a[i]=n.row;
        }
        return a;
}
}