
//Logic is from faadcoder and its awesome logic but loop me condtion isme wrong btai h 
class Solution {
    public ArrayList<String> genIp(String s) {
         
        
       // if(s.length()<=3) return;
        ArrayList<String>l= new ArrayList<>();
        for(int i=1; i<=3 &&i<s.length();i++)
        {
            String first=s.substring(0,i);
            if(isValid(first))
            {
                for(int j=i;j<s.length();j++)
                {
                    
                    String second= s.substring(i,j+1);
                    if(isValid(second))
                    {
                    
                        for(int k=j+1; k<s.length();k++)
                        {
                            String third= s.substring (j+1,k+1);
                            String fourth=s.substring(k+1);
                        
                            if(isValid(third)&& isValid(fourth))
                            {
                                String ans=first+"."+second+"."+third+"."+fourth;
                              // System.out.println(ans);
                                l.add(ans);
                            }
                        }
                    }
                }
             }

                
            }
    
    return(l);
    
    }
 public boolean isValid(String sub)
    {
       // System.out.println(sub);
        if(sub.length()>=4 || sub.length()==0) return false;
        else if(sub.charAt(0)=='0' && sub.length()>1) return false;
        
        {
            int range= Integer.parseInt(sub);//int i=Integer.parseInt(s); 
            if(range>=0 && range<=255) return true;
            else return false;
        }
    }
}