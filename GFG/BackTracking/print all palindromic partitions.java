// logic pepcoding
public class PalindromePartition {
	static boolean Ispalindrome(String s)
	{
		int l=s.length()/2 ;
		 char[] ch = s.toCharArray(); 
		 int right= s.length()-1;
		  for(int i=0;i<=l;i++)
		 {
			int left=i;
			
			if(ch[left]!=ch[right])
			{
			
				return false;
			}
			right--;
					
		}
		  

		  return true;
	}
	
	static void A(String s,String result,int length)
	{
		if(s.length()==0)
		{
		  
			System.out.print(result);
			System.out.println();
			return ;
		}
		for(int i=0;i<s.length();i++)
		{		String prefix= s.substring(0, i+1);
		  String restOf= s.substring(i+1);
		if(Ispalindrome(prefix)==true)
		{
			
			A(restOf,result+prefix+ " ",length);
		}
		
		}
	}
	

	public static void main(String[] args) {
		String s="geeks";
		A(s ,"",s.length());
	

	}

}
