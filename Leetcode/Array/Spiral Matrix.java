Logic- TECHDOSE
Hint===isme only jo 4 pointers liye jyge and loop to pta hi h kse chlga output ko dkhkr so easily lg jyga and isme 4 for loop and one while loop chlge

 public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>list= new ArrayList<>();
        int top=0;
        int left=0;
        int down= arr.length-1;
        int right= arr[0].length-1;
        int dir =0;
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i= left;i<=right;i++)
                {
                    list.add(arr[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    list.add(arr[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(arr[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    list.add(arr[i][left]);
                    
                }
                left++;
            }
            dir= (dir+1)%4;
        }
        return list;
        
    }