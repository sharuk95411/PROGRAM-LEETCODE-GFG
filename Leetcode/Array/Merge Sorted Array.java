// isko O(n+m) and SC O(1) me krna h and agr ques smjh na aye to Algorithm Made easy se dekh lena and ye ques khd se kia h 
// Hint- Back se traverse krege

  int j=m-1;
        int i=n-1;
        
        int length= m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums2[i]>=nums1[j])
            {
                nums1[length]= nums2[i];
                length--;
                i--;
            }
            else
            {
                nums1[length]=nums1[j];
                    length--;
                j--;
            
            }
        }
        while(i>=0)
        {
            nums1[length]= nums2[i];
            i--;
            length--;
        }