 public int numDecodings(String s) {
        
        int arr[]= new int[s.length()+1];
          Arrays.fill(arr, -1);
          return A(s,0,arr);
        
    }
    
    private int A(String s,int index,int arr[])
    {
        if(index==s.length()) return 1 ; 
        
        if(s.charAt(index)=='0') return 0;
    
        if(index==s.length()-1) return 1;
        
        if(arr[index]!=-1) return arr[index];
        
        arr[index]=  A(s,index+1,arr);
    
        if((Integer.parseInt(s.substring(index,index+2))<=26))
        {
               arr[index]= A(s,index+2,arr)+arr[index];
            
        }
        return arr[index];
    }