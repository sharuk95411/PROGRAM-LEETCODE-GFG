1== set method se list me kisi postion pr value replace hti h and add krne se value specific posn pr add ho jti h but us posn ki value ek step age bdh jti h
2== Convert int to String 
int i=10;  
String s=String.valueOf(i);//Now it will return "10"  
3== Convert String to int 
4== Isme sre conversion dekh lena int to long ,long to int ,int to float flot to int and so on....
int i=Integer.parseInt("200");  
4== ASCII value of small a =97 and b=98 and so on
5== ASCII calue of A=65 and B=66 and so on 
6- 
 //PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.a - p2.a); // sort in increasing order
// PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p2.a - p1.a); // sort in decreasing order
//PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq == b.freq ?  a.row-b.row : a.freq-b.freq); isme PQ me two cond use hui Ques no 1337(leetcode).
7== Convert int to char Array 
int a= 123;
char [] chars = String.valueOf(a).toCharArray();
8== Convert int to char ye javapoint se dekh lena kai variation btaye h wha pr
9== isme Hme String di h and hme use each charcter ki freq k base pr asc order me sort krna h to wo hmne kia h phle hashamp se freq nikal li h then age ye kia h and ye
yd rkhna importanat h
PriorityQueue<Map.Entry<Character,Integer>>pq= new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue());
for(Map.Entry<Character, Integer> entry: h.entrySet()) h is Object of HashMap
        {
            pq.offer(entry);
            
        }
System.out.println(pq.peek().getKey());
System.out.println(pq.peek().getValue());
10== 