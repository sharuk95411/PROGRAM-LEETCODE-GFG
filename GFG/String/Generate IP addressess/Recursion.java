// Isme Recursion lg jyga bcz hmare pas choices h 
// Logic -Self
// Approach- isme hme 3 dots lagne h and sth sth usko validate b krna h so hum all possible way le lte h string ko devide krne k and usme dots lga dege bs
basically ye permuation ka ques h hmre pas n item diye h and hme unhe 4 parts me devide krna h 
class Solution {
    public ArrayList<String> genIp(String s) {
        // code here
         ArrayList<String> res = new ArrayList<>();
        genIpUtil(s, 3, res, "");
        return res;
    }
     private void genIpUtil(String s, int dots, List<String> res, String strSoFar){
        if(dots==0 && isValid(s)){
            res.add(strSoFar+s);
            return;
        }
        for(int i=1; i<s.length(); i++){
            if(isValid(s.substring(0,i))){
                genIpUtil(s.substring(i), dots-1, res, strSoFar+s.substring(0,i)+".");
            }
        }
    }
    public boolean isValid(String sub)
    {
       // System.out.println(sub);
        if(sub.length()>=4 || sub.length()==0) return false;
        else if(sub.charAt(0)=='0' && sub.length()>1) return false;
        
        {
            int range= Integer.parseInt(sub);//int i=Integer.parseInt(s); 
            if(range>=0 && range<=255) return true;
            else return false;
        }
    }
}