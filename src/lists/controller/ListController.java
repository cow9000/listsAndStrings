package lists.controller;

import java.util.ArrayList;
import java.util.List;

import lists.model.Kahoot;

public class ListController
{

	private List<Kahoot> kahootList;
	/**
	 * Initalize all the variables
	 */
	public ListController()
	{
		kahootList = new ArrayList<Kahoot>();
	}
	/**
	 * start function of class, essentially starts the program
	 */
	public void start()
	{
		fillTheList();
		System.out.print(kahootList.size());
	}

	
	/**
	 * Fill the kahootList with Kahoot objects
	 */
	private void fillTheList()
	{
		
		
		//Repeat the for loop for 2,147,483,647 times
		for (int index = 0; index < Integer.MAX_VALUE; index++)
		{
			Kahoot kahoot = new Kahoot("Derek", index - Integer.MAX_VALUE);
			kahootList.add(kahoot);
			System.out.println(index);
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
