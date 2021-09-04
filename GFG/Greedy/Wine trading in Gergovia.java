import java.util.*;
public class MyClass {
    static  ArrayList<Pair>buy= new ArrayList<>();
    static  ArrayList<Pair>sell= new ArrayList<>();
        static class Pair
        {
            int value, index;
            Pair(int value,int index)
            {
                this.value=value;
                this.index=index;
            }
        }
       
        static void A(int arr[],int n)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]>0)
                buy.add(new Pair(arr[i],i));
                else
                sell.add(new Pair(arr[i],i));
            }
      
            int i=0,j=0;
            int ans=0;
            while(i<buy.size() && j<sell.size())
            {
                
                int x= Math.min(buy.get(i).value,sell.get(j).value);
                buy.get(i).value= buy.get(i).value-x;
                sell.get(j).value= sell.get(j).value+x;
                int diff= Math.abs(buy.get(i).index- sell.get(j).index);
                ans= ans+(x*diff);
                if(buy.get(i).value==0) i++;
                if(sell.get(j).value==0) j++;
            }
            
            System.out.println("Minimum Work is "+ans);
            
            }
    
    
    
    
    public static void main(String args[]) {
      int arr[]= {5,-4,1,-3,1};
      A(arr,arr.length);
    }
}