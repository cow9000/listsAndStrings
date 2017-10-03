package lists.view;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}

	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}

}
