/* logic pepcoding isme sara code tree se bnaya gya h so tree to bht ache se smjh lena 
		then code tum khd se likh skte h */
import java.util.*;
public class Partiion_K_Subsets {

	static int c=1;
	static void A(int i,int arr[],ArrayList<ArrayList<Integer>>l,int count,int k)
	{
		if(k>arr.length || k<=0)
		{
			System.out.println("You insert wrong partition no");
			return;
		}
		if(i==arr.length)
		{
			
			if(count==k)
			{  
		
				System.out.print(" Partition "+c +" is ");
			
				for(int m=0;m<k;m++)
				{
					
					System.out.print(l.get(m) +" ");
					
				}
				
				System.out.println();
				c++;
			}
			
		return ;
		}
		
		
		
		
		for(int j=0;j<k;j++)
		{
			if(l.get(j).size()>0)
			{
				l.get(j).add(arr[i]);
				A(i+1,arr,l,count,k);
				l.get(j).remove(l.get(j).size()-1); // backtraking
			}
			else
			{
				l.get(j).add(arr[i]);
				A(i+1,arr,l,count+1,k);
				l.get(j).remove(l.get(j).size()-1); // backtraking
		break; // ye break video me smjhaya gya h q lgaya h taki  12|3 aur 21|3 ye alg alg print na ho agr tum dry run kroge to ye bt smjha a jygi
			}
		}
	}
	public static void main(String[] args) {
		
		 int arr[]= {1,2,3};
		
ArrayList<ArrayList<Integer>> l= new ArrayList<>();
int k=2;
for(int i=0;i<k;i++)
{
	l.add(new ArrayList<>());
}
A(0,arr,l,0,k);

	}

}
