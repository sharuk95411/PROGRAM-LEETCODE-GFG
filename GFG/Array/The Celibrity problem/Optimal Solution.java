// Logic- Code Library
celebrity(int arr[][], int n)
    {
    	int celebrity=0;
    	for(int i=1;i<n;i++)
    	{
    	    if(arr[celebrity][i]==1 ) celebrity=i;
    	}
    	for(int i=0;i<n;i++)
    	{
    	    if(i!=celebrity && (arr[celebrity][i]==1 || arr[i][celebrity]==0 )) return -1;
    	}
    	return celebrity;
    }