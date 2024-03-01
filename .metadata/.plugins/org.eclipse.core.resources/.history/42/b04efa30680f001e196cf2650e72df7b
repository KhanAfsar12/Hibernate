package OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	@Column(name = "Answer_Id")
	private int AnswerId;
	
	private String answer;
    @ManyToOne 
    private Question1 question1;
    
	public Answer1(int answerId, String answer) {
		super();
		AnswerId = answerId;
		this.answer = answer;
	}
	
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAnswerId() {
		return AnswerId;
	}
	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question1 getQuestion1() {
		return question1;
	}

	public void setQuestion1(Question1 question1) {
		this.question1 = question1;
	}

	
    
}
