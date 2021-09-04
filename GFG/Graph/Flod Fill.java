class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
     
       if(sr<0 || sc>=image[0].length || sc<0 || sr>=image.length )
           return image;
      if( image[sr][sc]== newColor) return image; //yha ye islia kia gya h agr new color curr color se phle hi mathch kr rha h to hme kuch krna hi ni h yhi se return ho jyge.
        int currC= image[sr][sc];
        fill(image,sr,sc,currC,newColor);
        return image;
    }
     public void fill (int[][] image, int sr, int sc, int currcolor, int newColor) {
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] !=  currcolor) return;
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, currcolor, newColor);
        fill(image, sr - 1, sc, currcolor, newColor);
        fill(image, sr, sc + 1, currcolor, newColor);
        fill(image, sr, sc - 1, currcolor, newColor);
    }

}