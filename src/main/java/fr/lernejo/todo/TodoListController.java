package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public record TodoListController(TodoRepository todoRepository) {

    @PostMapping
    public TodoEntity createTodo(@RequestBody Todo todo) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.author = todo.author();
        todoEntity.message = todo.message();
        return this.todoRepository.save(todoEntity);
    }

    @GetMapping
    public Iterable<TodoEntity> getTodo() {
        return this.todoRepository.findAll();
    }
}
