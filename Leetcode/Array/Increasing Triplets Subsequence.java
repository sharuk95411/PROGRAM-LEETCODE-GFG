// Logic very simple from coding decding and TYN
    // Hint- take left and mid variable as Integer.MAX_VALUE then make a loop
    public boolean increasingTriplet(int[] nums) {
     
        int left= Integer.MAX_VALUE;
        int mid= Integer.MAX_VALUE;
        
        for(int a : nums)
        {
            if(a>mid) return true;
             else if(left>a) left=a;
        else if(a>left && a<=mid ) mid=a;
        }
       
        return false;
    }