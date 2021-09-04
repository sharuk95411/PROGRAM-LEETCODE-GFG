class Solution {
    public String reorganizeString(String s) {
        	    HashMap<Character,Integer>hm= new HashMap<>();
	    for(int i=0;i<s.length();i++)
	{
	   char c= s.charAt(i);
	   hm.put(c,hm.getOrDefault(c,0)+1);
	}
	
	
PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a) );
	     maxHeap.addAll(hm.keySet());
	 
	     
StringBuilder sb= new StringBuilder();
	 while(maxHeap.size()>1)
	 {
	     
	     char current= maxHeap.remove();
	     char next= maxHeap.remove();
	     sb.append(current);
	     sb.append(next);
	     hm.put(current,hm.get(current)-1);
	      hm.put(next,hm.get(next)-1);
	      if(hm.get(current)>0) maxHeap.add(current);
	      if(hm.get(next)>0) maxHeap.add(next);
	      
	      
	     
	 }
	
	 if(maxHeap.size()>0)
	 {
	     char last= maxHeap.remove();
	     if(hm.get(last)>1) return "";
	     else sb.append(last);
	     
	 }
	 return sb.toString();
	     
	     
    }
}