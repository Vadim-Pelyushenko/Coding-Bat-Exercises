
public class Ex15_AnswerCell
{
	// Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
	// answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
	{
		return !isAsleep && (!isMorning || isMom);
	}
}
