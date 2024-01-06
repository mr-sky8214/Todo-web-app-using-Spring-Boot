package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount, "akash", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "akash", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "akash", "Learn full stack", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUserName(String username) {
        return todos;
    }

    public void addTodo(String name, String description, LocalDate targetDate, boolean done) {
        todos.add(new Todo(++todosCount, name, description, targetDate, done));
    }
}
