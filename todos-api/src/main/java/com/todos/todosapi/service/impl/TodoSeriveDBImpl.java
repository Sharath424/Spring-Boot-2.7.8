package com.todos.todosapi.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todos.todosapi.exception.ResourceNotFoundException;
import com.todos.todosapi.model.Todo;
import com.todos.todosapi.repository.TodosRepostiory;
import com.todos.todosapi.service.TodosService;

@Service
public class TodoSeriveDBImpl implements TodosService {

	
	private TodosRepostiory todosRepostiory;

	@Override
	public List<Todo> getAllTodos() {
		// TODO Auto-generated method stub
		return todosRepostiory.findAll();
	}

	@Override
	public boolean deleteTodo(int id) {
		Optional<Todo> todo = todosRepostiory.findById(id);
		if(todo.isEmpty()) {
			throw new ResourceNotFoundException();
	
		}
		todosRepostiory.deleteById(id);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Todo getTodoById(int id) {
		Optional<Todo> todo = todosRepostiory.findById(id);
		if (todo.isPresent())
			return todo.get();
		throw new ResourceNotFoundException();
	}

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todosRepostiory.save(todo);
 	}

	@Override
	public Todo updateTodo(int id, Todo todo) {
		Optional<Todo> existingTodo = todosRepostiory.findById(id);
		if(existingTodo.isEmpty())
			throw new ResourceNotFoundException();
		Todo updatedTodo =	existingTodo.get();
		updatedTodo.setDescription(todo.getDescription());
		updatedTodo.setTargetDate(todo.getTargetDate());
		updatedTodo.setDone(todo.isDone());
		todosRepostiory.save(updatedTodo);
		
		return updatedTodo;
	}

}
