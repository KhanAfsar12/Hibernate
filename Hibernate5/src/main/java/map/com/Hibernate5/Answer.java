package map.com.Hibernate5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name ="answer_ans")
public class Answer {
	
    @Id 
   // @GeneratedValue(strategy = GenerationType.AUTO)
   private int answerId;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Question question;
   public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
   public Answer() {
	   super();
   }
public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

     
}
