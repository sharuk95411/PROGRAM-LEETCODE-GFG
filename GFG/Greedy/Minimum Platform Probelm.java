class Solution
{
    
    
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
    int platform=1;
    int a=1,b=0;
    
        for(int i=1;i<n;i++)
        {
            
            if(arr[a]>dep[b] )
            {
                b++;
                a++;
                
                continue;
            }
            else
            {
                platform++;
                a++;
            }
        }
        return platform;
    
        
    }
    
}

