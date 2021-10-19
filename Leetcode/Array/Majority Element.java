 // Isko O(n) $ O(1) me krna h 
// hint- Isme jo more than n/2 elements kha h usi ka advantage lia h bcz if totol elements are 7 then majority elements min 4 time to hga so agr hm freq lge to 
in the end hme value positive milegi bs yhi logic lga dia h 
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