/* For the beauty value of the ith element to be 2, it should be greater than all the elements on its left and smaller than all the elements on its right.
So, it should be greater than the maximum of all elements on the left and smaller than minimum of all elements on the right.

For the beauty value of the ith element to be 1, it should firstly not satisfy the above statement and secondly the ith element should be greater 
than the (i - 1)th element and lesser than*/

// Intution- isme 1 hne k liye simple h complicated 2 pr h jha left ki sari and right ki sri values ko dekha jyga so left ki value min and right ki value max hni 
chahiye current pr to hm esa krege jha pr h wha se left k max se compare krne pr bdi hui to obvious left l sare elements se bdi hgi and right me min lge agr wo 
min se chti hui to obvious bat h right side k sre elemnts se choti hgi to 2 ho jyga yha pr //

    public int sumOfBeauties(int[] arr) {
        
        int ans=0;
        int n= arr.length;
        int min_on_right[]= new int[n];
        
        min_on_right[n-1]= arr[n-1];
        for(int i=n-2;i>=2;i--)
        {
            min_on_right[i]= Math.min(min_on_right[i+1],arr[i]);
        }
        int max_on_left=arr[0];
        
        for(int i=1;i<=n-2;i++)
        {
            if(arr[i]>max_on_left && arr[i]<min_on_right[i+1]) ans+=2;
            else if(arr[i]>arr[i-1] && arr[i+1]>arr[i]) ans+=1;
            max_on_left= Math.max(max_on_left,arr[i]);
        }
        return ans;