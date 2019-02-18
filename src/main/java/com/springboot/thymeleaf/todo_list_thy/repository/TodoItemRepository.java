package com.springboot.thymeleaf.todo_list_thy.repository;

import com.springboot.thymeleaf.todo_list_thy.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}