 isko khd se ni kia h TC O(n) and SC is O(1) and Single pass me hua h
Idea is simple. Use two pointers.

If the current value is "0", keep going forward.
Left pointer points to the position of left "1" and right pointer points to the position of right "1". Keep updating two pointers and calculate the max distance.
Be careful of two situations: seats[0] is 0 and seats[len - 1] is 0. Just check them and get the final answer. Ex: 00101000
So the problem is to find the maximum distance between two continuous 1 in an array, and just return half of that maximum value...

 public int maxDistToClosest(int[] seats) {
        int left = -1, maxDis = 0;
        int len = seats.length;
        
        for (int i = 0; i < len; i++) {
            if (seats[i] == 0) continue;

            if (left == -1) {   //handles edge case when it start with 0.
                maxDis = Math.max(maxDis, i);
            } else { // when your seat is inbetween 1s, you need to find half point between the two so you divide by 2
                maxDis = Math.max(maxDis, (i - left) / 2);
            }
            left = i;
        }
        
        if (seats[len - 1] == 0) { //handles edge case when ends with 0.
            maxDis = Math.max(maxDis, len - 1 - left);
        }
        
        return maxDis;
    }