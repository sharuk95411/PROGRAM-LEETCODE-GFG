// Logic -self
public boolean findPair(int arr[], int size, int n)
    {
           if(size<=1) return false;
           
           Arrays.sort(arr);
           int left=0;
           int right=1;
           
           while(left<size && right<size)
           {
               int diff= arr[right]-arr[left];
               if(diff==n) return true;
                else if(diff>n) left++;
                else right++;
           }
           return false;
           
    }