package com.in28minutes.springboot.todoapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1, "John", "AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "John", "Spring Boot", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "John", "Python", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
