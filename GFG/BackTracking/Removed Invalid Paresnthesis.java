// logic pepcoding

    public List<String> removeInvalidParentheses(String s) {
        
    List<String>ans= new ArrayList<>();
         if (s == null) return ans;

        int no= A(s);
          B(s,no,ans);
          return ans;
}
        
	public int A(String str)
	{
		Stack<Character> s= new Stack<>();
               char c= s.charAt(i);
		for(int i=0;i<str.length;i++)
		{
			if(c=='(')
			{
				s.push(c);
			}
			else if(c==')')
			{
				
				 if(s.size()==0)
				{
					s.push(c);
				}
				else if(s.peek()=='(')
				{
					s.pop();
				}
				else if(s.peek()==')')
				{
					s.push(c);
				}
			}
		}
		return s.size();
		
	}
	static void B(String str,int no, List<String>ans)
	{
	if(no==0)// yha agr hme 2 parenthesis remove krna tha wo ho gi h  ab new String ko phir check krge agr newno zero aya tht's mean String balanaced h
		{
			int newno= A(str);
			if(newno==0)
			{
				if(!ans.contains(str))
				{
					System.out.println(str);
					ans.add(str);
				}
			}
		}
	for(int i=0;i<str.length();i++)
	{
String left= str.substring(0,i); /*yha pehle string ka pehla parenthesis remove hga then bd me uske age k bcz hme ni pta kn sa parenthesis remove krna h 
h so sre remove krke string check krge ,isi km ko krne k liye loop bnaya gya h.
			String right=str.substring(i+1); 
			B(left+right,no-1,ans);
			
			
		}
	}


