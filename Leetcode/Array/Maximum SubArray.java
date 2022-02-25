// isme mne khd se logic lgaya h but ye question kadan's algo se lg skta h  
 int ans=nums[0];
        int maxi= nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(ans<=0)
            {
                ans= Math.max(ans,nums[i]);
                maxi= Math.max(ans,maxi);
            }
            else if(ans>0)
            {
                ans= ans+nums[i];
            }
            maxi= Math.max(maxi,ans);
        }
        return maxi;