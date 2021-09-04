// task - knight ko 0,0 pr rkhkr hme all knigt position print krani h ki wo each box ko visit kre
/* isme basically hme knight k move ko ase chlana h ki 0,0 pr ans mil jye so isme knight k move ke
order ko arrange krna h main kam h */
// logic pepcoding
public class KnightTour {
	
	static void A(int board[][],int row,int col,int move)
	{
		if(row<0 ||col<0|| row>=board.length || col >=board.length || board[row][col]>0)
			return ;
	
		else if(move ==board.length*board.length-1)
	{
		board[row][col]=move;
		print(board);
		
	}
	
	board[row][col]= move;
	A(board,row+2,col+1,move+1); // inka sequence chnage hne pr 0,0 k liye ans ni milega  so hmara
	A(board,row+1,col+2,move+1);// task ye h ki knight ko 0,0 pr rkhkr solution print krana h ko ki
	A(board,row-1,col+2,move+1); // possible h agr hum knight k ase is order me chle.
	A(board,row-2,col-1,move+1);
	A(board,row-2,col+1,move+1);
	A(board,row+1,col-2,move+1);
	A(board,row-1,col-2,move+1);
	A(board,row+2,col-1,move+1);
	board[row][col]=0;
	
	
	}
	
	static void print(int board[][])
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
	
				System.out.print(board[i][j]+"    ");
			}
			System.out.println();
		}
		System.exit(0);
	}
	public static void main(String[] args) {

		int n=8;
		int board[][]= new int[n][n]; // Default value board in 0
		int row=0;
		int col=0;
		A(board,row,col,0);
/*yha row and column ki kuch ase b value hgi jha koi ans print ni hga bcz
		wha pr knight ko rkhne se solution ni milega */
	}

}
