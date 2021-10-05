// Question easy Logic-TECH DOSE not code 
// Hint- Isme Array ko only 1 hi bar traverse krna h 
// Yha deficit ghata hua petrol rkhta h jo ki 0 index se start index tk phcne k kam ayga taki jb hmare pas end me cal me jo petrol ho wo agr deficit se zyda hua to
 mtlab hm cal k petrol se wha start variable tk phch skte h agr ni phch skte to 0 return kr dega.
int tour(int petrol[], int distance[])
    {

	
	 
         int deficit=0, start=0,cal=0;
	for(int i=0;i<petrol.length;i++){
	    cal+=petrol[i]-distance[i];
	    if(cal<0){
	        start=i+1;
	        deficit+=cal;
	        cal=0;
	    }
	    
	}
	return (cal+deficit)>0 ? start :-1;
    }