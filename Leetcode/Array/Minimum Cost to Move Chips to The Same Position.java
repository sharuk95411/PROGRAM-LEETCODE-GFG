 // Awesonme and easy Question TYN
    // Logic- Naresh Gupta but MS
    public int minCostToMoveChips(int[] position) {
        
        int even_count=0;
        int odd_count=0;
        
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0) even_count++;
            else  odd_count++;
        }
        return Math.min(even_count,odd_count);
    }