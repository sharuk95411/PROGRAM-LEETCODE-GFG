// Hint- Replace +ve no with -ve No
int[] findTwoElement(int arr[], int n) {
        int a[]= new int[2];
        for(int i=0;i<n;i++)
        {
           int value= Math.abs(arr[i]);  // abs convert nigtive to postiive
            if(arr[value-1]>0)
            {
                arr[value-1]= -arr[value-1];
            }
            else
            {
                a[0]= value;// this is repeating number
                
            }
            
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++) // for missing leemnt
        {
            if(arr[i]>0)
          {
            a[1]=i+1;
            break;
          }
            
        }
        return a;
    }