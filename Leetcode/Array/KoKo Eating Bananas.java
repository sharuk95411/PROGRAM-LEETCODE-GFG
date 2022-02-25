hint- Use Binary search and easy question h only ye hint ko pakad lo
Intution-https://leetcode.com/problems/koko-eating-bananas/discuss/1703687/JavaC%2B%2B-A-very-very-well-detailed-explanation ans isme TC btai h and SC is O(1)
code- Khd se kia h 
class Solution {
    public int minEatingSpeed(int[] arr, int h) {
     
        Arrays.sort(arr);
        int ans=arr[arr.length-1];
        
        int left=1;
        int right= arr[arr.length-1];
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(check(mid,arr,h))
            {
                ans= Math.min(mid,ans);
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            
        }
        return ans;
            
    }
    private boolean check(int speed,int arr[],int final_hour)
    {
         int calculate_hour=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(speed>=arr[i])
            {
                calculate_hour= calculate_hour+1;
            }
            else if(arr[i]%speed==0)
            {
                calculate_hour=calculate_hour+ arr[i]/speed;
            }
            else
            {
                calculate_hour=calculate_hour+ arr[i]/speed+1;
            }
        }
        
        if(calculate_hour<=final_hour) return true;
        else return false;
        
    }
}