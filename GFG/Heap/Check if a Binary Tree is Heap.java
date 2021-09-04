class Solution
{
	boolean isHeap(Node tree)
	{
		if(tree==null ||tree.left==null && tree.right==null)
		return true;
		if(tree.left==null && tree.right!=null) return false;// condn to check full Binary Tree
		int l=0;
		int r=0;
		if(tree.left!=null)
		{
		    l= tree.left.data;
		}
		if(tree.right!=null)
		{
		    r= tree.right.data;
		}
		if(tree.data>l && tree.data>r && isHeap(tree.left)&& isHeap(tree.right))
		return true;
		return false;
	}
}