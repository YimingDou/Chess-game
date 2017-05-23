package chess;

//import java.awt.GridLayout;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import chess.Resources.Player;

/**
 * Reflect the status of chess
 * 1. record the trace
 * 2. show the turn
 */
public class feedBack
{
	/**
	 * @param white Label of partner
	 * @param black Label of partner
	 * @param trace TextArea for chess status
	 * @param hint TextArea for who's turn
	 */
	public feedBack(JLabel white, JLabel black, JTextArea trace, JTextArea hint)
	{
		whitePlayer = white;
		blackPlayer = black;
		traceText = trace;
		hintText = hint;
		step = 0;
	}
	
	/**
	 * reset trace info board
	 */
	public void clear()
	{
		step = 0;
		traceText.setText("The move record.\n");
	}
	
	/**
	 * @param player Player in chess
	 * @param piece chess piece
	 * @param origin chess piece location of before
	 * @param destination chess piece location of after
	 */
	public void trace(Player player, Piece piece, BoardLocation origin, BoardLocation destination)
	{
		if (player == Player.WHITE)
		{
			step ++;
			traceText.append(step + ". " + piece.getCharacter() + " " + origin.toString() + "-" + destination.toString() + "\t");
		}
		else
		{
			traceText.append(piece.getCharacter() + " " + origin.toString() + "-" + destination.toString() + "\n");
		}
	}
	
	/**
	 * Hint info board
	 * @param str String of hint to display
	 */
	public void Hint(String str)
	{
		hintText.append(str + "\n");
	}
	
	/**
	 * Chess player play in turn
	 * @param player player turn to play
	 */
	public void showTurn(Player player)
	{
		if (player == Player.WHITE)
		{
			whitePlayer.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
			blackPlayer.setBorder(null);
			hintText.append("WHITE player turn.\n");
		}
		else if (player == Player.BLACK)
		{
			whitePlayer.setBorder(null);
			blackPlayer.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
			hintText.append("BLACK player turn.\n");
		}
		else
		{
			whitePlayer.setBorder(null);
			blackPlayer.setBorder(null);
		}
	}
	
	private int step = 0;
	private JLabel whitePlayer;
	private JLabel blackPlayer;
	private JTextArea traceText;
	private JTextArea hintText;
}
