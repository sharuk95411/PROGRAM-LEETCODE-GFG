if(arr.length<3) return 0;
        int left_max=Integer.MIN_VALUE;
        int right_max= Integer.MIN_VALUE;
        int trapped_water=0;
        for(int i=1;i<arr.length-1;i++)
        {
            int j=0;
            while(j<i)
            {
                left_max= Math.max(left_max,arr[j]);
                j++;
                
            }
           
            j++;
            while(j<arr.length)
            {
                right_max= Math.max(right_max,arr[j]);
                j++;
            }
            int a= Math.min(left_max,right_max);
            if(a>arr[i])
            {
            trapped_water= trapped_water+(a-arr[i]);
            }
            left_max=-1;
            right_max=-1;
                
        }
        return trapped_water;