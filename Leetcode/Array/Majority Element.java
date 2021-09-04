 // Isko O(n) $ O(1) me krna h 
    public int majorityElement(int[] arr) {
        int no=arr[0];
        int freq=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==no) freq++;
            else
            {
                freq--;
                if(freq==0)
                {
                    no= arr[i];
                    freq++;
                }
            }
        }
    return no;