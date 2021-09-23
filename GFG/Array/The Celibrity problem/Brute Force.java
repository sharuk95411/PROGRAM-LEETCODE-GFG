// logic- Code Library
int celebrity(int arr[][], int n)
    {
    	int know[]= new int[n]; // jo janta h mean normal people
    	int known[]= new int[n]; // jisko janta h mean celibrity
    	
    	for(int i=0;i<n;i++)
    	{
    	    for(int j=0;j<n;j++)
    	    {
    	        if(arr[i][j]==1 )
    	        {
    	            know[i]++;
    	            known[j]++;
    	        }
    	    }
    	}
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(known[i]==n-1 && know[i]==0 ) return i;
    	}
    	return -1;
    }