 if(arr.length<3) return 0;
        int trapped_water=0;
        int left_max= arr[0];
        int right_max= arr[arr.length-1];
        int left= 1;
            int right= arr.length-2;
        while(left<=right)
        {
            if(right_max>left_max)
            {
                if(left_max>arr[left])trapped_water= trapped_water+(left_max-arr[left]);
                left_max=Math.max(left_max,arr[left]);
                left++;
                
            }
            else
            {
                if(right_max>arr[right]) trapped_water= trapped_water+(right_max-arr[right]);
                right_max= Math.max(right_max,arr[right]);
                    right--;
            }
        }
        return trapped_water;