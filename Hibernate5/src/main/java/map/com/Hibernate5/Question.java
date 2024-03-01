package map.com.Hibernate5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Comment;

@Entity

public class Question {
	@Id
	@Column(name = "Question_Id")
	private int quesId;
	private String question;
	@OneToOne
	@JoinColumn(name = "ans_id")
	private Answer answer;

	public Question(int quesId, String question, Answer answer) {
		super();
		this.quesId = quesId;
		this.question = question;
		
		this.answer = answer;
	}

	public Question() {
		super();
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	  public Answer getAnswer() { return answer; }
	  
	  public void setAnswer(Answer answer) { this.answer = answer; }
	  
	 

}