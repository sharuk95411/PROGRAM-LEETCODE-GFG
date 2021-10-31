class Solution { 
    // Sliding Windows k topic me iske bre me likha h first visit that 
    // Hint- Loop k andr loop loga whle(true) ye outer loop h 
  // Leetcode Minimum Window SubString
    
    public String minWindow(String s, String p) {
           if (s.length() == 0 || p.length() == 0) 
            return "";
        HashMap<Character,Integer>h1= new HashMap<>();
          HashMap<Character,Integer>h2= new HashMap<>();
          for(int i=0;i<p.length();i++)
          {
              char c=p.charAt(i);
              h2.put(c,h2.getOrDefault(c,0)+1);
          }
          int i=-1,j=-1,count=0;
          String ans="";
          while(true)
          {
              boolean f1= false;
              boolean f2=false;
             while(count<p.length() && j<s.length()-1) // find first ans;
             {
                 f1= true;
                 
                 j++;
                  char c=s.charAt(j);
              h1.put(c,h1.getOrDefault(c,0)+1);
              if(h1.getOrDefault(c,0)<=h2.getOrDefault(c,0)) count++;
              
             }
          
          

             while(i<j && count==p.length())
             {
                 f2= true;
               String temp=s.substring(i+1,j+1);
                if(ans.length()==0 ||ans.length()>temp.length())
                {
                    ans=temp;
                  //  System.out.println(ans);
                }
                i++;
                char ch= s.charAt(i);
                int freq1= h1.getOrDefault(ch,0);
                int freq2= h2.getOrDefault(ch,0);
              if(freq1==1) 
              {
                  h1.remove(ch);
                  freq1=0;
              }
              
              else
              {
                  h1.put(ch,freq1-1);
                  freq1--;
              }
              
              if(freq1<freq2)
              {
                  count--;
              }
              
             }
            
         if(f1==false &&f2==false) break;
        
          }
        
        return ans;
    }
}