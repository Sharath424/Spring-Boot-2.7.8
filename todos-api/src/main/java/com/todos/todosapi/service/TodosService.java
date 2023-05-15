package com.todos.todosapi.service;

import java.util.List;

import com.todos.todosapi.model.Todo;

public interface TodosService {
	
	List<Todo> getAllTodos();
		
	boolean deleteTodo(int id);

	Todo getTodoById(int id);

	Todo saveTodo(Todo todo);

	Todo updateTodo(int id, Todo todo);
	

}
