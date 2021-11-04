class Solution {
    // hint- iski simple problem dekh lo whi se idea mil jyga
    // code- Anuj Bhaiya
    
    public int maxProfit(int[] arr) {
        
        if(arr.length==0) return 0;
        int profit=0;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]) profit+= arr[i]-arr[i-1];
        }
        
        return profit;
        
    }
}