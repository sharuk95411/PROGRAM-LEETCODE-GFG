// Question ko bht hi khusurat trike se solve kia gya h 
// Hint- Freq store krne k liye simple array ka use hua h

class Solution{
    static int minValue(String str, int k){
        int MAX_CHAR = 26;
 
        int l = str.length(); // find length of string
 
    // if K is greater than length of string so reduced string will become 0
        if (k >= l)
            return 0;
 
//  find Frequency of each character and store in an array
        int[] frequency = new int[MAX_CHAR];
        for (int i = 0; i < l; i++)
            frequency[str.charAt(i) - 'a']++;
 
// creating a priority queue with comparator such that elements in the queue are in descending order.
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
 
        // Push each char frequency into a priority_queue
        for (int i = 0; i < MAX_CHAR; i++) {
            if (frequency[i] != 0)
                q.add(frequency[i]);
        }
 
        // Removal of K characters
        while (k != 0) {
            q.add(q.poll() - 1);
            k--;
        }
        int result = 0; 
        while (!q.isEmpty()) {
            result += Math.pow(q.poll(),2);
        }
 
        return result;
    }
}