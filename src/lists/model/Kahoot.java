package lists.model;

import java.util.ArrayList;
import java.util.List;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;

	private List<String> listOfQuestions;

	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;

		this.listOfQuestions = new ArrayList<String>();

	}

	public Kahoot(String creator, int questionCount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}

	public Kahoot(int questionCount, int level, String creator, boolean isJumble)
	{
		this.questionCount = questionCount;
		this.level = level;
		this.creator = creator;
		this.isJumble = isJumble;
	}

	public String returnQuestion(int index)
	{
		if (listOfQuestions.size() < index)
		{
			return this.listOfQuestions.get(index);
		}
		return "";

	}

}
