package OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import map.com.Hibernate5.Answer;

@Entity
public class Question1 {
 
	@Id
	@Column(name = "Question_Id")
	private int QuestionId;
	
	@Column(name = "Question")
	private String question;
	
	@OneToMany
	private List<Answer1> answer;
	public Question1(int questionId, String question, List<Answer1> answer) {
		super();
		QuestionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer1> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}
	
	
	
}