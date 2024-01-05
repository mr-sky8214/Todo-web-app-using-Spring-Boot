package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "akash", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "akash", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "akash", "Learn full stack", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUserName(String username) {
        return todos;
    }
}
