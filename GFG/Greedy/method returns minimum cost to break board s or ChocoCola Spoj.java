import java.util.Arrays;
import java.util.Collections;

class GFG
{
	
	static int minimumCostOfBreaking(Integer X[], Integer Y[],int m, int n)
	{
		
	
		// sort the horizontal cost in reverse order
		Arrays.sort(X, Collections.reverseOrder());
	
		// sort the vertical cost in reverse order
		Arrays.sort(Y, Collections.reverseOrder());
	
		int i=0,j=0,cost=0;
	int rows= n;
      int cols= m;
	int hor_part=1,ver_part=1; // this is intresting kb kisko increase krna h and kisko kis cost me 
add krna h ye logic bs dhyan rkhna wse vdio me code krte time isko bht easy way se explain kia gya h
	
	while(i<rows && j<cols)
	{
		if(X[j]>=Y[i])  //Vertical cut
		{
			cost+=X[j]*ver_part;
		hor_part++;// Verticul cut se hor part kse bdhte h vdio me btaya gya h
			j++;
		}
		else         //horizontal Cut
		{
			cost+=Y[i]*hor_part;
		ver_part++; // Horizontal cut se ver part kse bdhte h vdio me btaya gya h
			i++;
		}
	}
	while(i<rows)
	{
		cost+=Y[i]*hor_part;
		ver_part++;
		i++;
	}
	while(j<cols)
	{
	
			cost+=X[j]*ver_part;
			hor_part++;	
			j++;
	}
	
	

	
	return cost;

		
	}
	
	
	public static void main(String arg[])
	{
		int m = 6, n = 4;
		Integer X[] = {2, 1, 3, 1, 4};
		Integer Y[] = {4, 1, 2};
		System.out.print(minimumCostOfBreaking(X, Y, m-1, n-1));
	}
}

