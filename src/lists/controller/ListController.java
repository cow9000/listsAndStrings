package lists.controller;

import java.util.ArrayList;
import java.util.List;

import lists.model.Kahoot;
import lists.view.PopupDisplay;

public class ListController
{

	private List<Kahoot> kahootList;
	private PopupDisplay display;
	/**
	 * Initalize all the variables
	 */
	public ListController()
	{
		display = new PopupDisplay();
		kahootList = new ArrayList<Kahoot>();
	}
	/**
	 * start function of class, essentially starts the program
	 */
	public void start()
	{
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for(int index = 0; index < kahootList.size(); index++) {
			display.displayText(kahootList.get(index).toString());
		}
	}

	
	/**
	 * Fill the kahootList with Kahoot objects
	 */
	private void fillTheList()
	{
		
		
		//Repeat the for loop for 5 times
		for (int index = 0; index < 5; index++)
		{
			Kahoot kahoot = new Kahoot("Derek", Integer.MAX_VALUE);
			
			kahootList.add(kahoot);
			
		}
		
		//Add the Kahoot objects we did in class
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan",2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama",44);
		kahootList.add(fiftyStates);
		kahootList.add(mySecondKahoot);
		kahootList.add(bigQuiz);
		kahootList.add(animalColor);
		kahootList.add(presidents);
		
		
	}

}
