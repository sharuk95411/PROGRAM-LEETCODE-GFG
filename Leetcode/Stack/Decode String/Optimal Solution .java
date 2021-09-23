// Code By Knoledge Centre and logic behind this code is easy you can easily understand by dry run the code if you are did it brute force.
// is progem me [a]2[bc] is type ka case ni ho skta h each variable k sath integer attached hga and usi ka bht acha istemal kia gya h is program me.

class Solution {
    int index=0;
    public String decodeString(String s) {
        
        StringBuilder str= new StringBuilder();
        while(index<s.length()&& s.charAt(index)!=']')
        {
            char c= s.charAt(index);
            if(Character.isDigit(c))
            {
                int value= 0;
                while(index<s.length()&&Character.isDigit(s.charAt(index)))
                {
                    value=value*10+s.charAt(index)-'0';
                        index++;
                }
        index++; // yhe again index++ krne se '[' isko skip kr dte h and iski need b ni h hme
            
            String r=decodeString(s);
            while(value-->0)
            {
                str.append(r);
            }
            index++;
                
            }
            else
            {
                str.append(s.charAt(index));
                index++;
            }
        }
        return str.toString();
    }
}