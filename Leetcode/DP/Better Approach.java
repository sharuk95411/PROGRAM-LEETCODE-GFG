class Solution {
    
    // Isko dp se krna h bcz ye qustion DP ka h 
    // Approach- agr koi b string palindrome hgi to usme mid se left jane pr and right jane pr element equla ate jyge like aabaa yha b mid h and hm iske left and as well as right ja rhe h aur compare kr rhe h Charcaters ko so isse pta chl jyga ye palindrome h
    // Ab agr string even hui aabb to hum dno ko equla part me devide krke whi check krne ka km start kr dege. left part me aa and right part me bb a jyga bs bs  yhi logic niche lgaya h
    // TC O(n2) and SC O(1)
    public String longestPalindrome(String s) {
        // Nick White
     
        if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
        String ans= "";
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i); // for odd length;
      //  System.out.println(len1);
        
        int len2 = expandAroundCenter(s, i, i + 1);// for even length
    //    System.out.println(len2);
        int len = Math.max(len1, len2);
       // System.out.println(len);
        if (len > end - start)  /* yha len palindrome wli string ki length h agr ye phle se di hui plaindrome string ki length jo ki right-left se niklegi 
           agr usse zyda hui tbhi ye andr jygi.*/
        {
      if(len>ans.length())/* ye case uske liye h jb hme new palindromic string mili h but agr uski length already ans me mili hui string k length k barabr h
 to hme isko ni lena h bcz hme first jo max length ki substring h wo print krwani h agr ye case hta do tb b ans submit ho jyga 
but ye case InterviewBit se pta chla h and isme b ye case lia gya h but submit uske bina ho ja rha h*/
            {
            start = i - (len - 1) / 2;// ye strt position nikale ka hugad h
            end = i + len / 2;  // ye end position of string nikale ka jugad h
            ans= s.substring(start,end+1);
            }
            //length=start+end+1;
            
        }
    }
    return ans;
    }
    
    private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1; // ye palindromic string ki length return kr rha h .
}
}