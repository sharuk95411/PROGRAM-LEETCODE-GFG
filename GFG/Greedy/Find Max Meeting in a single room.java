import java.util.*;
public class MyClass {
    
    static class A
    {
        int index,s,f;
        A(int s,int f,int i)
        {
            this.s=s;
            this.f=f;
            index=i;
        }
    }
    static void fun(int s[],int f[])
    {
        ArrayList<Integer>l= new ArrayList<>();
        A arr[]= new A[s.length];
        for(int i=0;i<s.length;i++)
        {
        arr[i]= new A(s[i],f[i],i+1); // yha i+1 islye hga bcz 0 index wli job 1 count ki jygi
        }
     
        Arrays.sort(arr,(a,b)->a.f-b.f);
       
      
       int c=1;
       l.add(arr[0].index);
	
	int prev_end = arr[0].f;
	
	for(int i = 1; i < s.length; i++)
	{
		if (arr[i].s> prev_end)
		{
		     l.add(arr[i].index);
			prev_end = arr[i].f;
			c++;
		}
	}
	System.out.println(l);
      
        
     
          
          
    }
    public static void main(String args[]) {
     int  s[] = {1, 3, 0, 5, 8, 5};
     int f[] = {2, 4, 6, 7, 9, 9} ;
      fun(s,f);
    }
}