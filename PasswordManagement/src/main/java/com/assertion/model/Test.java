package com.assertion.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	static DBOperation db=new DBOperation();
	public static void main(String[] args) {
		db.getData();
		System.out.println("Completed...........................................................");
	}

}
