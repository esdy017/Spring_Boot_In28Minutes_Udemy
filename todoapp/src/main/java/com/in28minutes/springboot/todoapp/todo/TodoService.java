package com.in28minutes.springboot.todoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "John", "AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "John", "Spring Boot", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "John", "Python", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean completed) {
        todos.add(new Todo(++todosCount, username, description, targetDate, completed));
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
