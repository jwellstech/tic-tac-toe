import java.util.ArrayList;

public class Tree
{
	TreeNode root;
	public Tree(TreeNode root)
	{
		this.root = root;
	}
}
class TreeNode
{
    //We need to figure something out here as we will more often than not have way more than two children
    ArrayList<TreeNode> childList = new ArrayList();
	int rowVal;
	int colVal;
	int board[][];
	public TreeNode(int board[][], int colVal, int rowVal)
	{
		this.board = board;
		this.rowVal = rowVal;
		this.colVal = colVal;
	}
}
