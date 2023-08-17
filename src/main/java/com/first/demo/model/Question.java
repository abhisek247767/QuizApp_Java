package com.first.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "quiz_questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;

    @Column(name = "right_answer")
    private String right_answer; // Note: consider renaming this field to rightAnswer to follow Java naming conventions

    @Column(name = "difficulty_level")
    private String difficulty_level; // Note: consider renaming this field to difficultyLevel to follow Java naming conventions

    @Column(name = "category")
    
    private String category;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getQuestionTitle() {
			return questionTitle;
		}
		public void setQuestionTitle(String questionTitle) {
			this.questionTitle = questionTitle;
		}
		public String getOption1() {
			return option1;
		}
		public void setOption1(String option1) {
			this.option1 = option1;
		}
		public String getOption2() {
			return option2;
		}
		public void setOption2(String option2) {
			this.option2 = option2;
		}
		public String getOption3() {
			return option3;
		}
		public void setOption3(String option3) {
			this.option3 = option3;
		}
		public String getOption4() {
			return option4;
		}
		public void setOption4(String option4) {
			this.option4 = option4;
		}
		public String getRight_answer() {
			return right_answer;
		}
		public void setRight_answer(String right_answer) {
			this.right_answer = right_answer;
		}
		public String getDifficulty_level() {
			return difficulty_level;
		}
		public void setDifficulty_level(String difficulty_level) {
			this.difficulty_level = difficulty_level;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "Question [id=" + id + ", questionTitle=" + questionTitle + ", option1=" + option1 + ", option2="
					+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", right_answer=" + right_answer
					+ ", difficulty_level=" + difficulty_level + ", category=" + category + "]";
		}
		public Question(Integer id, String questionTitle, String option1, String option2, String option3,
				String option4, String right_answer, String difficulty_level, String category) {
			super();
			this.id = id;
			this.questionTitle = questionTitle;
			this.option1 = option1;
			this.option2 = option2;
			this.option3 = option3;
			this.option4 = option4;
			this.right_answer = right_answer;
			this.difficulty_level = difficulty_level;
			this.category = category;
		}
		public Question() {
			super();
		}
	    
	    
	    

}
