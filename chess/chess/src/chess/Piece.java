package chess;

import java.awt.Image;
import chess.Resources.PieceType;
import chess.Resources.Player;

/**
 * Chess piece object
 */
public class Piece
{
	/*
	 * constructor
	 * @param plr Player 
	 * @param pieceIdx index of piece
	 */
	public Piece(Player plr, int pieceIdx)
	{
		player = plr;
		pieceIndex = pieceIdx;
		name = Resources.getPieceString(pieceIndex);
		character = Resources.getPieceCharacter(pieceIndex);
		type = Resources.PIECE_INSTANCE_TYPES[pieceIndex];
		if (player == Player.WHITE)
		{
			image = Resources.WHITE_PIECE_IMAGES[Resources.PIECE_INSTANCE_TYPES[pieceIndex].ordinal()];
		}else
		{
			image = Resources.BLACK_PIECE_IMAGES[Resources.PIECE_INSTANCE_TYPES[pieceIndex].ordinal()];
		}
	}
	
	/**
	 * whose piece
	 * @return Player piece's player
	 */
	public Player getPlayer()
	{
		return player;
	}
	
	/**
	 * @return String piece name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return char piece char
	 */
	public char getCharacter()
	{
		return character;
	}
	
	/**
	 * @return PieceType type
	 */
	public PieceType getType()
	{
		return type;
	}
	
	/**
	 * @return Image piece image
	 */
	public Image getImage()
	{
		return image;
	}
	
	/**
	 * @return int piece index
	 */
	public int getIndex()
	{
		return pieceIndex;
	}
	
	private Image image;
	private Player player;
	private String name;
	private char character;
	private PieceType type;
	private int pieceIndex;
}
