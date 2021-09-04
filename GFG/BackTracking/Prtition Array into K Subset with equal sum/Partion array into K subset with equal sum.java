import java.util.*;
public class MyClass {
    static boolean A(int arr[],int n,int k)
    {
        if(k>n) return false;
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum= sum+arr[i];
        }
        if(sum%k!=0)return false;
        
        
 ArrayList<ArrayList<Integer>> l= new ArrayList<>();
for(int i=0;i<k;i++)
{
	l.add(new ArrayList<>());
}
int a[]= new int[k];

 return B(0,arr,l,0,k,a);
        
    }
    
    	static boolean B(int i,int arr[],ArrayList<ArrayList<Integer>>l,int count,int k,int sum[])
	{
		if(i==arr.length)
		{
			
			if(count==k)
			{  
		           for(int m=0;m<sum.length-1;m++)
		           {
		               if(sum[m]!=sum[m+1])
		               return false;
		           }
		           
		          for(int m=0;m<k;m++)
				{
					
					System.out.print(l.get(m) +" ");
					
				}
		      
		           return true;
			}
			
		return  false;
		}
		
		
		for(int j=0;j<k;j++)
		{
			if(l.get(j).size()>0)
			{
				l.get(j).add(arr[i]);
				sum[j]+= arr[i];
				if(B(i+1,arr,l,count,k,sum))
				{
				    return true;
				}
				l.get(j).remove(l.get(j).size()-1); // backtraking
				sum[j]-= arr[i]; // backtracking
			}
			else
			{
				l.get(j).add(arr[i]);
				sum[j]+= arr[i];
				if(B(i+1,arr,l,count+1,k,sum))
				{
				    return true;
				}
				
				l.get(j).remove(l.get(j).size()-1);// backtraking
				sum[j]-= arr[i];  // backtraking
	      	break; 
			}
		}
		return false;
	}
    
    public static void main(String args[]) {
       int arr[]= {2,1,4,5,6};
       int k=3;
      A(arr,arr.length,k);
    }
}