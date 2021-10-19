// isko krne se phle Majority Elmenet wla kr lena uske bd iska intution easily smjh aa jyga
     // yha each element more than n/3 times hga so tum array ka koi b size le lo maximum no tmhe 2 hi milege so yha se ye confirm ho gya h hme only max only 2 diffrent elements mil skte h.
    // Logic -TUF
    public List<Integer> majorityElement(int[] arr) {
        List<Integer>l= new ArrayList<>();
        int n1,n2,freq1,freq2;
        n1=n2=-1;
        freq1=freq2= 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n1) freq1++;
            else if(arr[i]==n2)freq2++;
            else if(freq1==0)
            {
                n1=arr[i];
                freq1++;
            }
            else if(freq2==0)
            {
                n2= arr[i];
                freq2++;
            }
            else
            {
                freq1--;
                freq2--;
            }
        }
        // Now ab hm check krege ye n1 and n2 n/3 times se zyda h ya ni and isko nikalna zruri b h [3,2,3] k case me ans [3,2] ayga jbki an only 3 ana chahiye
        
        freq1=freq2=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==n1) freq1++;
        else if(arr[i]==n2) freq2++;
    }
    
        int n= arr.length;
    if(freq1>n/3) l.add(n1);
        if(freq2>n/3) l.add(n2);
        return l;
    }