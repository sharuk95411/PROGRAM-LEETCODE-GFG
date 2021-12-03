// Logic- 3 sum or 4 sum koi b le lo same hi logic use hua h     
long countTriplets(long arr[], int n,int sum)
    {
          long count=0;
          if(arr.length<3) return count;
          Arrays.sort(arr);
          
          for(int i=0;i<n-2;i++)
          {
              int left=i+1;
              int right= n-1;
              while(left<right)
              {
                 long temp=arr[i]+arr[left]+arr[right];
                  if(temp<sum )
                  {
                      count=count+right-left; // yha right-left isliye kia h bcz ab right se left tk jitne b hge wo sab sum se lam hi hge so isse TC 
                                                aur b optimise ho jygi bcz hme phr thde km steps krne pdege
                      left++;
                  }
                  else if(temp>=sum) right--;
              }
          }
          return count;
    }