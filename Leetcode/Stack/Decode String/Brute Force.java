// Brute force jisme O(n) Space lia gya h isko O(1) SC me krna Optimal solution h jo ki recursion se hga 
public String decodeString(String s) {
         Stack<Integer>s1= new Stack<>();
        Stack<String>s2= new Stack<>();
        
        String res="";
        int index=0;
        while(index<s.length())
        {
            if(Character.isDigit(s.charAt(index)))
            {
             int count=0;
             while(Character.isDigit(s.charAt(index)))
             {
count= 10*count+(s.charAt(index)-'0'); /*ye ek trika h agr 30 aya to phle 3 then 0 but final to hme 30 push
         krna h to ase count me 30 aa jyga you can check it */ 
                 index++;
             }
             s1.push(count);
            }
            else if (s.charAt(index)=='[')
            {
                s2.push(res);
                res="";
                index++;
            }
              else if (s.charAt(index)==']')
            {
     StringBuilder str = new StringBuilder(s2.pop());// yha str me res aa gya h 
     int count=s1.pop();
     for(int i=0;i<count;i++)
     {
         str.append(res); 
     }
     res=str.toString(); // yha str object h so usko STring me rkhne k liye typecaste kr rhe h
     index++;
                
            }
              else 
            {
                res= res+s.charAt(index);
                index++;
            }
        }
        return(res);
        
        
    }