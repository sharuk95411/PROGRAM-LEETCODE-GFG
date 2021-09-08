/* isko char array me convert krke b kr skte h but time comp bht zyda hgi 
 int count =0;
        for(int i=0;i<arr.length;i++)
        {
           char [] chars = String.valueOf(nums[i]).toCharArray();
            if(chars.length%2==0)
            {
                count++;
            }
        }
    
        return count;
        */
class Solution {
    
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num: nums) {
if((num > 9 && num < 100) ||(num > 999 && num < 10000) ||(num > 99999 && num < 1000000) )
    count++;
        }
        return count;
    }
}