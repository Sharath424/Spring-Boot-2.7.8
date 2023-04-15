package com.todos.todosapi.service.impl;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todos.todosapi.exception.ResourceNotFoundException;
import com.todos.todosapi.model.Todo;
import com.todos.todosapi.service.TodosService;

@Service
public class TodoServiceInMemoryImpl implements TodosService {

	private static List<Todo> todos =new ArrayList<>();
	
	private static int todosCount =3;
	
	
	static {
		todos.add(new Todo(1,"user1","Learn Spring Boot", new Date(),false));
		todos.add(new Todo(2,"user2","Learn Spring Boot", new Date(),false));
		todos.add(new Todo(3,"user3","Learn Spring Boot", new Date(),false));
			
	}



public List<Todo> getAllTodos() {
	// TODO Auto-generated method stub
	return todos;
	}

@Override
public Todo getTodoById(int id) {
	System.out.println("Loading from Static ArrayList");
	for(Todo todo: todos) {
		if(todo.getId()==id) {
			return todo;
		}
	}
	throw new ResourceNotFoundException();
}

@Override
public Todo saveTodo(Todo todo) {
	todo.setId(++todosCount);
	todos.add(todo);
	return todo;
	// TODO Auto-generated method stub
	
}

@Override
public Todo updateTodo(int id, Todo todo) {
	Todo existingTodo =this.getTodoById(id);
	if(existingTodo!=null) {
		existingTodo.setUser(todo.getUser());
		existingTodo.setDescription(todo.getDescription());
		existingTodo.setTargetDate(todo.getTargetDate());
		existingTodo.setDone(todo.isDone());	
	}
	return existingTodo;
	
}


@Override
public boolean deleteTodo(int id) {
	
	for(int i=0;i< todos.size();i++) {
		if(todos.get(i).getId()==id) {
			todos.remove(i);
			return true;
		}
	}
	return false;
}

}