static int pageFaults(int N, int C, int arr[]){
        ArrayList<Integer>l= new ArrayList<>();
     int fault=0;
     for(int i=0;i<arr.length;i++)
     {
         if(l.size()<C && l.contains(arr[i])==false)
         {
             l.add(arr[i]);
             fault++;
         }
         else if(l.size()>=C && l.contains(arr[i])==false) // yha list full h to new page ane pr LRU jo
ki index 0 pr hga wo remove hga .
         {
             l.remove(0);
             l.add(arr[i]);
             fault++;
         }
         else if(l.contains(arr[i])==true) // yha page mil gya h 
         {
            int index= l.indexOf(arr[i]);
            l.remove(index);
            l.add(arr[i]);
            
         }
     }
     return (fault);
    }