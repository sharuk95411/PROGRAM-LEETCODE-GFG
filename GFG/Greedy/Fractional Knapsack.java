class Solution
{

class A implements Comparator<Item>
{
    public int compare(Item i1,Item i2)
    {
   double d1    =    (double)(i1.value)/ i1.weight;
    double d2   =    (double)(i2.value)/ i2.weight;
    if(d1>d2)
    return -1;
    else if (d1<d2)
    return 1;
    else 
    return 0;
        
    }
}
    
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double value=0;
        
           Arrays.sort(arr,new A());
        
        for(int i=0;i<n;i++)
         {
             
             if(W>=arr[i].weight)
             {
                 value=value+arr[i].value;
                 W=W-arr[i].weight;
             }
             else if(W!=0)
             {
                 double a= W*((double)arr[i].value/arr[i].weight);
                 value= value+a;
                 break;
                 
             }
         }
         return value;
        
    }
}