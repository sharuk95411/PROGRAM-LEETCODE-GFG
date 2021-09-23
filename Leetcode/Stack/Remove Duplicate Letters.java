// Logic-Pepcoding
// isme kai sari chzi seekhe mo mili h jse freq ko kse store kia h String builder ka use and chcracter ko int me convert krke khelna
// TC O(n) and SC O(stack+visited+freq);  
// yha mne HashMap se kia tha Freq k liye but usse TC bhtt zyda a ri thi.
int n= s.length();
        boolean visited[]= new boolean[26];
        int freq[]= new int[26];
        char ch[]= s.toCharArray();
        
        for(int i=0;i<n;i++)
        {
            freq[ch[i]-'a']= freq[ch[i]-'a']+1;
        }
        
        int index;
        Stack<Character>stack= new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            if(visited[ch[i]-'a']) 
            {  
                 freq[ch[i]-'a']= freq[ch[i]-'a']-1;
                   continue;
            }
            else
            {
                while(stack.size()>0 &&(stack.peek()>ch[i])&& freq[stack.peek()-'a']>0)
                {
                    visited[stack.pop()-'a']=false;
                }
                stack.push(ch[i]);
                visited[ch[i]-'a']=true;
                freq[ch[i]-'a']= freq[ch[i]-'a']-1;
            }
        }
         StringBuilder sb = new StringBuilder();
    //pop character from stack and build answer string from back
    while(!stack.isEmpty()){
        sb.insert(0,stack.pop()); // yhe 0 pr insert krwa rhe h agr wha koi element hua to wo right side move ho jyga nice approcach.
    }
    return sb.toString();