package com.springboot.thymeleaf.todo_list_thy.model;

import com.springboot.thymeleaf.todo_list_thy.entity.TodoItem;

import javax.validation.Valid;
import java.util.ArrayList;

public class TodoListViewModel {

	@Valid
	private ArrayList<TodoItem> todoList = new ArrayList<TodoItem>();

	public TodoListViewModel() {}

	public TodoListViewModel(ArrayList<TodoItem> todoList) {
		this.todoList = todoList;
	}

	public ArrayList<TodoItem> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<TodoItem> todoList) {
		this.todoList = todoList;
	}
}