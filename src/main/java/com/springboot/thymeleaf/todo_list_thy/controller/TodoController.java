package com.springboot.thymeleaf.todo_list_thy.controller;

import com.springboot.thymeleaf.todo_list_thy.entity.TodoItem;
import com.springboot.thymeleaf.todo_list_thy.model.TodoListViewModel;
import com.springboot.thymeleaf.todo_list_thy.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TodoController {

    @Autowired
    private TodoItemRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<TodoItem> todoList = (ArrayList<TodoItem>) repository.findAll();
        model.addAttribute("newitem", new TodoItem());
        model.addAttribute("items", new TodoListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute TodoItem requestItem) {
        TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
        repository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute TodoListViewModel requestItems) {
        for (TodoItem requestItem : requestItems.getTodoList() ) {
             TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
             item.setComplete(requestItem.isComplete());
             item.setId(requestItem.getId());
             repository.save(item);
            if(requestItem.isComplete() == true){
                item.setComplete(requestItem.isComplete());
                item.setId(requestItem.getId());
                repository.delete(item);
            }
        }
        return "redirect:/";
    }
}
