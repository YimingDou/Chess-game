package chess;

import java.awt.*;

import javax.swing.*;

/**
 * BoardGrid of panel
 */
public class BoardGrid extends JPanel
{
	
	/*
	 * constructor
	 * @param loc BoardLocation in boardgrid
	 */
	public BoardGrid(BoardLocation loc)
	{
		inBoard = true;
		location = loc;
		if ((location.getX() + location.getY()) % 2 == 0)
			this.setBackground(new Color(255,200,142));
		else
			this.setBackground(new Color(187,94,0));
	}
	
	// for captured pieces
	public BoardGrid(int pieceIndex)
	{
		inBoard = false;
		location = new BoardLocation(-1, pieceIndex);
		this.setVisible(false);
	}
	
	/**
	 * override method
	 * @param g Graphics handle
	 */
	public void paintComponent(Graphics g){
	      super.paintComponent(g);
	      g.drawImage(image,0,0,50,50,null);
	      
	}     
	
	/*
	 * setting
	 * @param img Image class
	 */
	public void setImage(Image img)
	{
		image=img;
	}

	/*
	 * setting
	 * @parma loc BoardLocation instance to lay
	 */
	public void setLocation(BoardLocation loc)
	{
		location = loc;
		if ((location.getX() + location.getY()) % 2 == 1)
			this.setBackground(Color.LIGHT_GRAY);
		else
			this.setBackground(Color.ORANGE);
	}
	
	/*
	 * setting
	 * @param aPiece Piece of chess
	 */
	public void setPiece(Piece aPiece)
	{
		piece = aPiece;
		image = piece.getImage();
		this.setVisible(true);
		
		Resources.trace(piece.getPlayer() + piece.getName() + "(" + location.getX() + "," + location.getY() + ")");
	}
	
	/*
	 * setting
	 * clear piece and image
	 */
	public void setEmpty()
	{
		image = null;
		piece = null;
		if (!inBoard)
			this.setVisible(false);
	}

	/*
	 * setting
	 * select status
	 */
	public void setSelected()
	{
		this.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
	}
	
	/*
	 * setting
	 * clear select status
	 */
	public void setUnSelected()
	{
		this.setBorder(null);
	}
	
	/*
	 * getting
	 * @return BoardLocation of now
	 */
	public BoardLocation getlocation()
	{
		return location;
	}
	
	/*
	 * getting
	 * @return Image of now piece
	 */
	public Image getImage()
	{
		return image;
	}
	
	/*
	 * getting
	 * @return Piece of now chess
	 */
	public Piece getPiece()
	{
		return piece;
	}
	
	private Image image;
	private BoardLocation location;//Æå×ÓµÄÎ»ÖÃ
	private Piece piece;
	private boolean inBoard;

}
