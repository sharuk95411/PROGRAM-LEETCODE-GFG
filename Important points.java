1== set method se list me kisi postion pr value replace hti h and add krne se value specific posn pr add ho jti h but us posn ki value ek step age bdh jti h
2== Convert int to String 
3== Convert String to int 
4== Isme sre conversion dekh lena int to long ,long to int ,int to float flot to int and so on....
4== ASCII value of small a =97 and b=98 and so on
5== ASCII calue of A=65 and B=66 and so on 
6== Monotonic Stack 
6- 
 //PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.a - p2.a); // sort in increasing order
// PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p2.a - p1.a); // sort in decreasing order
//PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq == b.freq ?  a.row-b.row : a.freq-b.freq); isme PQ me two cond use hui Ques no 1337(leetcode).
7== Convert int to char Array 
int a= 123;
char [] chars = String.valueOf(a).toCharArray();
8== Convert int to char ye javapoint se dekh lena kai variation btaye h wha pr
9== isme Hme String di h and hme use each charcter ki freq k base pr asc order me sort krna h to wo hmne kia h phle hashamp se freq nikal li h then age ye kia h and ye
yd rkhna importanat h (347 isi concept based h but ye string wla 451 Q No h)
PriorityQueue<Map.Entry<Character,Integer>>pq= new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue()); // Yha PriorityQueue HashMap type ka h 
for(Map.Entry<Character, Integer> entry: h.entrySet()) h is Object of HashMap
        {
            pq.offer(entry);
            
        }
System.out.println(pq.peek().getKey());
System.out.println(pq.peek().getValue());
// Reorganize String ye ques leetcode pr h usme b PQ ka freq k base pr bht acha use hua h so use b dhyn rkhna
10==  Traverse the HashMap 
11== LinkedHashMap and sare Collections pdh lena ek bar ache se
12== HashMap me data Key k base pr sort hokr save hta h chahe wo key character type ki ho ya int type ki
13== Sort the 2D-Array on the based on any specic column
Arrays.sort(arr, (a, b) -> a[1] - b[1]); yha 1 second column ko bta rha h bcz indexing 0 se start hti h
14== Make Priority Queue array type and sort thr value on the bases on any index 
   PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
15== arr.length gives the length of the no of rows in 2D array
16== arr[0].length gives the length of no of columns of 2D array
17== https://www.cs.usfca.edu/~galles/visualization/Heap.html Min Heap Visulization 
18== split mtthod ka use agr hum meta data(,.!][/? etc) me kr rhe h to hme split(\\then charcter name) use krna hga only 2 forward slash ka use hga and and wse simple
split() ka use kr skte h ( 165 Q me iska use hua h ) 