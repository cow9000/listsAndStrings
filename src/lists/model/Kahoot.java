package lists.model;

import java.util.ArrayList;
import java.util.List;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;
		
	private List<String> listOfQuestions;

	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
		this.topic = "some topic";
		this.listOfQuestions = new ArrayList<String>();

	}

	public Kahoot(String creator, int questionCount, String topic)
	{
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;
	}

	public Kahoot(int questionCount, int level, String creator, boolean isJumble, String topic)
	{
		this.questionCount = questionCount;
		this.level = level;
		this.creator = creator;
		this.isJumble = isJumble;
		this.topic = topic;
	}

	public String returnQuestion(int index)
	{
		if (listOfQuestions.size() < index)
		{
			return this.listOfQuestions.get(index);
		}
		return "";

	}
	
	public String toString() {
		String description = "This Kahoot was made by " + creator + " and it has " + questionCount + " questions.";
		
		
		
		return description;
	}
	
	public String getCreator() {
		return creator;
	}

}
