
public class MyClass {
    
    static void A(int h,int a)
    {
        
    int ans= Math.max(B(h+3,a+3,1),(Math.max(B(h-5,a-10,2),B(h-20,a+5,3))));
    System.out.println(ans);
    
    }
    
    static int B(int h,int a,int part)
    {
        if(h<=0 || a<=0) return 0;
        
        int x=0,y=0,z=0;
        if(part!=1) x= 1+ B(h+3,a+3,1);
        if(part!=2) y= 1+B(h-5,a-10,2);
        if(part!=3) z= 1+B(h-20,a+5,3);
        return Math.max(x,Math.max(y,z));
        
        
        
        
    }
    
    
    
    public static void main(String args[]) {
      int health= 20;
      int armor= 8;
      A(health,armor);
    }
}