//Isme testcase ko hta dia h 
//isko jdoodle pr compile kia h max test case k liye and coding blocks pr b 
//isme greedy use hua h bcz isme sorting hui h .
import java.util.*;
public class Main {
    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
		
			int row=sc.nextInt();
			int col=sc.nextInt();
			int tower=sc.nextInt();
			List<Integer>h= new ArrayList<>();
			List<Integer>v= new ArrayList<>();
			for(int i=0;i<tower;i++)
			{
				int x= sc.nextInt();
				int y=sc.nextInt();
				h.add(x);
				v.add(y);
			}
			h.add(row);
			v.add(col);
			Collections.sort(h);
			Collections.sort(v);
			int mx= h.get(0)-1;
			int my= v.get(0)-1;
			for(int i=1;i<h.size();i++)
			{
				mx= Math.max(mx,(h.get(i)-h.get(i-1)));
				my= Math.max(my,(v.get(i)-v.get(i-1)));
			}
			
			int ans= mx*my;
		
			System.out.println(ans);
    }
}