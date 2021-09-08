 public int sumOddLengthSubarrays(int[] arr) {
        
      /* This is BF TC O(n2) & SC is(1) isko b try krna h and ye khd se kia h 
      int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans+arr[i];
            int sum=arr[i];
            int j=i+1;
            int count=1;
            while(j<arr.length)
            {
                sum= sum+arr[j];
                count++;
                if(count%2!=0) ans= ans+sum;
                
                j++;
            }
        }
        return ans;  */
        // Optimal - TC O(n) & SC O(1)
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
    sum= sum+(((i+1)*(arr.length-i)+1)/2)*arr[i]; // logic behind this formula Shashwat Tiwari and iski help se even length ka b sum easily nikal skte ho 
        }
        return sum;
    }