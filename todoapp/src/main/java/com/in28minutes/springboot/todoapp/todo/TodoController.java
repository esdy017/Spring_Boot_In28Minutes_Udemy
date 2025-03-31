package com.in28minutes.springboot.todoapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public String listTodos(ModelMap modelMap) {
        List<Todo> todos = todoService.findByUsername("John");
        modelMap.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "/addTodo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap modelMap) {
        Todo todo = new Todo(0, (String)modelMap.get("name"), "", LocalDate.now().plusMonths(3), false);
        modelMap.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "/addTodo", method = RequestMethod.POST)
    public String addNewTodoAndRedirect(ModelMap modelMap, @Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "todo";
        }
        todoService.addTodo((String) modelMap.get("name"), todo.getDescription(), LocalDate.now().plusMonths(3), false);
        return "redirect:todos";
    }

    @RequestMapping(value = "/deleteTodo")
    public String deleteTodoAndRedirect(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:todos";
    }

}
