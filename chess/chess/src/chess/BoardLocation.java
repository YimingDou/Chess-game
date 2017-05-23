
package chess;

/**
 *
 * @author Coder
 */
public class BoardLocation
{
	private int x;
	private int y;
	
	/*
	 * constructor 
	 * @param x position-x
	 * @param y position-y
	 */
	public BoardLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/*
	 * getting method
	 * @return x
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * getting method
	 * @return y
	 */
	public int getY()
	{
		return y;
	}
	
	/*
	 * is same location
	 * @param otherLocation BoardLocation class
	 */
	public boolean equals(BoardLocation otherLocation)
	{
		return this.x == otherLocation.getX() && this.y == otherLocation.getY();
	}
	
	/*
	 * toString function
	 */
	public String toString()
	{
		return "" + (char)('A' + x) + "" + (y + 1) + "";
	}
	
	public static String getNullToString()
	{
		return "--";
	}
	
	/**
	 * location translate
	 * (x,y) -> BoardLocation
	 * @param x position-x
	 * @param y position-y
	 */
	public static BoardLocation getNewBoardLocationFromTableCoordinates(int x, int y)
	{
		return new BoardLocation(x, Resources.BOARD_SIZE - (y + 1));
	}
}
