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
		String currentCreator = "";
		for(int index = 0; index < kahootList.size(); index++) {
			
			Kahoot currentKahoot = kahootList.get(index);
			currentCreator = currentKahoot.getCreator();
			display.displayText(currentKahoot.toString());
			
			if(currentCreator.equalsIgnoreCase("Nobody")) {
				for(int loop = 0; loop < 5; loop += 1) {
					display.displayText("wow" + currentCreator + " does a lot");
				}
			}
			for(int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1) {
					display.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex+1));
			}
			
			String topic = currentKahoot.getTopic();
			for(int i = topic.length()-1; i >= 0; i --) {
				display.displayText(topic.substring(i, i+1));
			}
			
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
			Kahoot kahoot = new Kahoot("Derek", Integer.MAX_VALUE, "hi is 6 23");
			
			kahootList.add(kahoot);
			
		}
		
		//Add the Kahoot objects we did in class
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "fifty states");
		Kahoot mySecondKahoot = new Kahoot("Ethan",2, "1");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");
		Kahoot animalColor = new Kahoot("Branton", 10, "dogeroni colors");
		Kahoot presidents = new Kahoot("Obama",44, "president of oboamamamamamamama");
		kahootList.add(fiftyStates);
		kahootList.add(mySecondKahoot);
		kahootList.add(bigQuiz);
		kahootList.add(animalColor);
		kahootList.add(presidents);
		
		
	}

}
