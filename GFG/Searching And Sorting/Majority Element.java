// Hint- Isme two seperate loops ka use hga

 

static int majorityElement(int arr[], int size)
    {
        
        
         int no=arr[0];
        int freq=1;
        for(int i=1;i<arr.length;i++)  // this is for find max freq element
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
        freq=0;
        for(int i=0;i<size;i++) // now yha check krege jo element mila h kya uski freq size/2 se zyda h ya ni
        {
          if(arr[i]==no) freq++;
        }
        if(freq>arr.length/2) return no;
        else return -1;
    }