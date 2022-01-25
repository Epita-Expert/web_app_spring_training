package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {
    private ArrayList<Todo> todos = new ArrayList<Todo>();

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        this.todos.add(todo);
        return todo;
    }

    @GetMapping
    public ArrayList<Todo> getTodo() {
        return this.todos;
    }
}
