package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//public class Task {
//    private String taskName;
//    private String taskDescription;
//	public String getTaskName() {
//		return taskName;
//	}
//	public void setTaskName(String taskName) {
//		this.taskName = taskName;
//	}
//	public String getTaskDescription() {
//		return taskDescription;
//	}
//	public void setTaskDescription(String taskDescription) {
//		this.taskDescription = taskDescription;
//	}
//}



@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "task_description")
    private String taskDescription;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
}