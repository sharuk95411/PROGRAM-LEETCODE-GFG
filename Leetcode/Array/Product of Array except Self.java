// Ye solution O(n) and O(1) me h and !00% submission rate h 
    // Is question me only zero ka khyl rkhna h q ki prblm whi krega so whi hmne kia h 
    public int[] productExceptSelf(int[] nums) {
        int arr[]= new int[nums.length];
        
        int count=0; 
        int multiplication_result=1;
        int index_of_zero=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) 
            {
                count++;
             index_of_zero=i;
            }
            else
            {
                multiplication_result= nums[i]*multiplication_result;
            }
            
        }
        if(count>1)
        {
            Arrays.fill(arr, 0);
            return arr;
        }
        else if(count==1)
        {
            Arrays.fill(arr,0);
            arr[index_of_zero]=multiplication_result;
            return arr;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                arr[i]= multiplication_result/nums[i];
            }
            return  arr;
        }
    }