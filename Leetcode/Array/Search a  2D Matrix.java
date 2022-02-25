        Khd se kia h mne without any help
        int j= arr[0].length;
        int row=-1;

         // this loop to find the target element lie in which row
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<=target && arr[i][j-1]>=target)
            {
                row= i;
                break;
            }
        }
        
        // if target element out of range then 
        if(row==-1) return false;
        
        
        // Now use binary search 
        int left=0,right= arr[0].length;
        
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            
            if(arr[row][mid]==target) return true;
            else if(arr[row][mid]>=target) right= mid-1;
            else left= mid+1;
        }
        
        // if element not present then simple return false;
        return false;
    }
