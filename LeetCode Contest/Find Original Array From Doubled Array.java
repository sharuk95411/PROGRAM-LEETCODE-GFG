TC  O(nlogK) i dont know where is come K
// Isme pehle question ache se pdh lena origal array se changed array bnaya gya h jisme orignal array k elements ko double kia gya h and the shuffle.
// code lee215
 public int[] findOriginalArray(int[] A) {
        int n = A.length, i = 0;
        if (n % 2 == 1) return new int[0];
        int[] res = new int[n / 2];
        Map<Integer, Integer> count = new TreeMap<>(); // isme value sorted form me store hti h key k bases pr 
        for (int a : A)
            count.put(a, count.getOrDefault(a, 0) + 1);
        for (int x : count.keySet()) {
            if (count.get(x) > count.getOrDefault(x + x, 0))
                return new int[0];
            for (int j = 0; j < count.get(x); ++j) {
                res[i++] = x;
                count.put(x + x, count.get(x + x) - 1);
            }
        }
        return res;
    }