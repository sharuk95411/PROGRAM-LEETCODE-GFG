// logic pepcoding
import java.util.*;
public class TugOfWar {
static int sum=Integer.MAX_VALUE;
static String ans=" ";
	static void A(int set[],int index,ArrayList<Integer> l1,ArrayList<Integer> l2,
			int sofset1,int sofset2)
	{
		if(index==set.length)
		{
			int diff=Math.abs(sofset1-sofset2);
			if(diff<sum)
			{
	          sum=diff;
	          ans= l1 +" "+l2;
			}
			return;
		}
		
		
	if(l1.size()<=(set.length+1)/2) 
	{
		l1.add(set[index]);
		A(set,index+1,l1,l2,sofset1+set[index],sofset2);
		l1.remove(l1.size()-1);// ye backtracking ho ri h
		
	}
	if(l2.size()<=(set.length+1)/2) 
	{
		l2.add(set[index]);
		A(set,index+1,l1,l2,sofset1,sofset2+set[index]);
		l2.remove(l2.size()-1);// ye backtracking ho ri h
		
	}

		
	}
	
	public static void main(String[] args) {
	 int set[]= {1,2,3,4,5};
	 ArrayList<Integer> l1= new ArrayList<>();
	 ArrayList<Integer> l2= new ArrayList<>();
	 
		A(set,0,l1,l2,0,0);
		System.out.println(ans);
		

	}

}
