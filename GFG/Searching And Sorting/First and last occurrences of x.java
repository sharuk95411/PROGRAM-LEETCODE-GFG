// Simple two function bna do first leftMost index k liye and second right most index k liye
class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int arr[]= new int[2];
        arr[0]=startIndex(nums,target);
     
        arr[1]= endIndex(nums,target);
       return arr;
    }
    
     public int startIndex(int arr[],int target)
   {
       int index=-1;
       int start=0;
       int end= arr.length-1;
       while(start<=end)
       {
           int mid= start+ (end-start)/2;
           if(arr[mid]>=target)
           {
               end=mid-1;
           }
           else
           {
            start= mid+1;   
           }
           if(arr[mid]==target)
           {
               index=mid;
           }
       }
    
       return index;
   }
   public int endIndex(int arr[],int target)
   {
       int index=-1;
       int start=0;
       int end= arr.length-1;
       while(start<=end)
       {
           int mid= start+ (end-start)/2;
           if(arr[mid]<=target)
           {
               start=mid+1;
           }
           else
           {
            end= mid-1;   
           }
       
       if(arr[mid]==target)
       {
           index= mid;
       }
       }
       return index;
   }
}