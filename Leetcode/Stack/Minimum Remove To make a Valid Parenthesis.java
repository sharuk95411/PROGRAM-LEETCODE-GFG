// Logic- Naresh Gupta isko Bina Stack k b kr skte h jo ki Naresh ki vdio me btaya gya h usse TC aur km ati h but ye stack ka ques h so pehle stack perspective se solve kro.
class Solution {
    public String minRemoveToMakeValid(String s) {
     char ch[]= s.toCharArray();
     Stack<Integer>stack= new Stack<>();
     for(int i=0;i<ch.length;i++)
     {
         if(ch[i]=='(')
         {
             stack.push(i);
         }
         else if(ch[i]==')')
         {
             if(stack.size()==0)
             {
                 ch[i]='*';
             }
             else
             {
                 stack.pop();
             }
            
         }
     }
     
         while(stack.size()!=0)
         {
             ch[stack.pop()]='*';
         }
     
     // Yha String s="" ; empty string lekr usme add krne se TC 5 times zyda ho jygi but i dont know why but StringBuilder use krne se TC bht km ho jti h
      StringBuilder sb1 = new StringBuilder("");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '*')
                sb1.append(ch[i]);
        }

        return sb1.toString();
    }
}