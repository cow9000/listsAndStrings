package tools.controller;

import java.util.ArrayList;
import java.util.List;

import tools.model.Kahoot;
import tools.view.PopupDisplay;

public class Controller
{

	private List<Kahoot> myKahoot;
	private PopupDisplay popup;

	/**
	 * Initalize all the variables
	 */
	public Controller()
	{
		popup = new PopupDisplay();
		myKahoot = new ArrayList<Kahoot>();
	}

	/**
	 * start function of class, essentially starts the program
	 */
	public void start()
	{
		fillTheList();
		// showTheList();
		changeTheList();
	}

	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoot.size(); index++)
		{

			Kahoot currentKahoot = myKahoot.get(index);
			currentCreator = currentKahoot.getCreator();
			popup.displayText(currentKahoot.toString());

			if (currentCreator.equalsIgnoreCase("Nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow" + currentCreator + " does a lot");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}

			String topic = currentKahoot.getTopic();
			for (int i = topic.length() - 1; i >= 0; i--)
			{
				popup.displayText(topic.substring(i, i + 1));
			}

		}
	}

	/**
	 * Fill the kahootList with Kahoot objects
	 */
	private void fillTheList()
	{

		// Repeat the for loop for 5 times
		for (int index = 0; index < 5; index++)
		{
			Kahoot kahoot = new Kahoot("Derek", Integer.MAX_VALUE, "hi is 6 23");

			myKahoot.add(kahoot);

		}

		// Add the Kahoot objects we did in class
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "fifty states");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "1");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");
		Kahoot animalColor = new Kahoot("Branton", 10, "dogeroni colors");
		Kahoot presidents = new Kahoot("Obama", 44, "president of oboamamamamamamama");
		myKahoot.add(fiftyStates);
		myKahoot.add(mySecondKahoot);
		myKahoot.add(bigQuiz);
		myKahoot.add(animalColor);
		myKahoot.add(presidents);

	}

	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoot.size());
		Kahoot removed = myKahoot.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoot.size() + " items inside");
		myKahoot.add(0, removed);
		popup.displayText("The list is still: " + myKahoot.size() + " items big.");
		removed = myKahoot.set(2, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with on by: " + myKahoot.get(2).getCreator());
	}

	public int findMaxLength(ArrayList<String> myList)
	{
		int max = 0;
		for (int index = 0; index < myList.size(); index++)
		{
			if(myList.get(index).length() > max) {
				max = myList.get(index).length();
			}
		}
		
		return max;
	}

	public PopupDisplay getPopup()
	{
		return popup;
	}

	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoot;
	}

}
