package com.beuno.inhealthwealth.expenditure;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Expenditure {

	@Id
	private String id;
	
	private String expenseName;
	
	private Date creationDate = new Date();
	
	private Map<String, String> expenseSettings = new HashMap<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Map<String, String> getExpenseSettings() {
		return expenseSettings;
	}

	public void setExpenseSettings(Map<String, String> expenseSettings) {
		this.expenseSettings = expenseSettings;
	}
	
}
