 // Isko O(n),O(1) me kia gya h O(n) SC me krna bht easy h .
//Isme only three steps h--(1) reverse the whole Array.(2)-reverse the array start to k-1 (3)-reverse the array k to end simple
class Solution {
    public void rotate(int[] nums, int k) {
      k= k%arr.length; /*===ye line imp h when arr [1,2,3] k=4 and ans is arr[3,1,2] bcz yha k ki value 1 aygi arr ki length 3 h to 3 steps reverse krne pr whi arr
 ayga and 1 steps hme aur roatte krna hga but k ko modulo krne se only 1 times krna pdega .ye tb k liye h jb k>= arr.length. isme k wo steps h jitna hme rotate krna h 
na ki index no;===*/
        
        
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    
   private void reverse( int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp= arr[end];
            arr[end]=arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }
}