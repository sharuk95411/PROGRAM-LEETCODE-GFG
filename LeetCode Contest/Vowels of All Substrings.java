class Solution {
  
    // Bht pyara logic h jo ki only ek loop me krna h isliye hi aa paya h so Constraints easy question ko aur b acha bna dete h 
    
    public long countVowels(String s) {
          long count=0;
        String vowel="aeiou";
        long n= s.length();
        for(int i=0;i<n;i++)
        {
            if(vowel.indexOf(s.charAt(i))>=0)
            {
                count+= (n-i)*(i+1);
            }
        }
        return count;
}
}