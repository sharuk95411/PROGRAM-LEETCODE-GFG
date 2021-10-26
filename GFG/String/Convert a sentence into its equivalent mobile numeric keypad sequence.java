// Acha logic h  
String printSequence(String s) 
    { 
        String str ="";
        if(s.length()==0) return str;
        String arr[]= {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
            str=str+"0" ;
            }
            else
            {
                int pos= s.charAt(i)-'A';
                str= str+arr[pos];
            }
        }
        return str;
    }