// Brute force= TC(n2) and SC(1) and this question follows optimal solution TC O(n) and SC O(1)
// logic -lee215
// hint -traverse from the right side and isme hmne koi b extra array ni lia h usi array ko modify krke return kia h
  public int[] replaceElements(int[] arr) {
        int max=-1,a;
        for(int i= arr.length-1;i>=0;i--)
        {
            a=arr[i];
            arr[i]= max;
            max= Math.max(a,max);
            
        }
        return arr;
    }