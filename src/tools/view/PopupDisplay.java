package tools.view;

import javax.swing.JOptionPane;
/**
 * 
 * Simple GUI class using JOptionPane
 * @author Derek Vawdrey
 *@version 1.0 03.10.2017
 */
public class PopupDisplay
{
	/**
	 * Displays a popup showing the supplied String to the user.
	 * @param message The text to be displayed.
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Displays a popup to get a response from the user.
	 * @param fromQuestion The text to be displayed
	 * @return The users response to the question
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}

}
