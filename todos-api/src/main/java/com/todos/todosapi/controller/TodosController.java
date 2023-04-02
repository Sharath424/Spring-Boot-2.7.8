package com.todos.todosapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todos.todosapi.exception.ResourceNotFoundException;
import com.todos.todosapi.model.Todo;
import com.todos.todosapi.service.TodosService;

@RestController
@RequestMapping("/api/v1/todos")
public class TodosController {
	
	
	@Autowired
	private TodosService todoService;

	@GetMapping()
	public List<Todo> getAllTodos(){
		List<Todo> allTodos = todoService.getAllTodos();
		return allTodos;
	}
	
	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable int id) {
		return todoService.getTodoById(id);
	}
	
	@PostMapping()
	public ResponseEntity<Todo> saveTodo(@RequestBody Todo todo){
		Todo newTodo=todoService.saveTodo(todo);
		return new ResponseEntity<Todo>(newTodo,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable int id,@RequestBody Todo todo){
		Todo updatedTodo =todoService.updateTodo(id, todo);
		return new ResponseEntity<Todo>(updatedTodo,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTodo(@PathVariable int id){
	boolean result =todoService.deleteTodo(id);
	if(!result) {
		throw new ResourceNotFoundException();
	}
	return new ResponseEntity<String>("Successfully Deleted Todo",HttpStatus.OK);
	}
	}

