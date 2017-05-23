package chess;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

/**
 * Listener of mouse action
 */
public class MouseListener extends MouseAdapter{
	/**
	 * constuctor
	 */
	public MouseListener()
	{

	}

	/**
	 * mouse left click
	 * @param event event from button pressed
	 */
	public void mouseClicked(MouseEvent event)
	{
		if (event.getSource() == btnRestart)
		{
			play.restart();
			return;
		}

		if (event.getSource() == btnQuit)
		{
			System.exit(0);
		}
		
		BoardGrid grid = (BoardGrid)event.getSource();
		
		play.handleClick(grid);

	}
	
	public void mousePressed(MouseEvent event)
    {
		
    }
	
	/**
	 * @param play ChessPlay
	 */
	public void setPlay(ChessPlay aplay)
	{
		play = aplay;
	}
	
	/**
	 * setting
	 * @param restart Button of Restart
	 */
	public void setRestartButton(JButton restart)
	{
		btnRestart = restart;
	}
	
	/**
	 * setting
	 * @param quit Button of Quit
	 */
	public void setQuitButton(JButton quit)
	{
		btnQuit = quit;
	}
	
	private ChessPlay play;
	private JButton btnRestart;
	private JButton btnQuit;
}
