package com.myproject.mappingdemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	
	@OneToOne
	private Answer answer;

	public Question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public Question() {
		super();
		
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
