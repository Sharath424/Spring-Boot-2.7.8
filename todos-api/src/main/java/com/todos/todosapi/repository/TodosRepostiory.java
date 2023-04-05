package com.todos.todosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todos.todosapi.model.Todo;

public interface TodosRepostiory  extends JpaRepository<Todo, Integer>{

	Todo findByTodo(String description);
}
