TC  O(n) SC  O(n) but still TLE dont know why
// isko khd se kia h mne 
public String removeDuplicates(String s, int k) {
        
        int count =1;
        for(int i=1;i<s.length();i++)
        {
            
            if(s.charAt(i)==s.charAt(i-1))
            { count++;
            }
            else count=1;
                if(count==k)
                {
                    
                    s=removeDuplicates(s.substring(0,i-k+1)+s.substring(i+1),k);
                    
                }
            }
        
        return s;
        
    }