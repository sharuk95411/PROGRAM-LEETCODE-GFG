 // Is questionn ka Logic smjh ni aya h algo smjh a ri h and ye best solution h so isi se smjhna
    public int maxProduct(int[] a) {
        if (a == null || a.length == 0)
    return 0;

  int ans = a[0], min = ans, max = ans;
  
  for (int i = 1; i < a.length; i++) {
    if (a[i] >= 0) {
      max = Math.max(a[i], max * a[i]);
      min = Math.min(a[i], min * a[i]);
    } else {
      int tmp = max;
      max = Math.max(a[i], min * a[i]);
      min = Math.min(a[i], tmp * a[i]);
    }
    
    ans = Math.max(ans, max);
  }
  
  return ans;
        
    }