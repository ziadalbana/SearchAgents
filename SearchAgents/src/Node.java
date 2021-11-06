
public class Node {
	
	//cost and heuristic
	public int g , h  ;
	//coordinates of blank tile 
	public int x,y ;
	
	
	public int[][] state = new int[3][3] ;
	
	public Node(int g, int h , int[][] state, int x, int y)
	{
		this.g = g ;
		this.h = h ;
		this.x = x ;
		this.y = y ;
		this.state = state ;
	}
}
