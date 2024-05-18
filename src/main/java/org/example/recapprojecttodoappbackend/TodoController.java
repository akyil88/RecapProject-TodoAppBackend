package org.example.recapprojecttodoappbackend;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class TodoController {
    private final TodoService todoService;
    private final TodoRepository todoRepository;


    @PostMapping("/todo")
    public ResponseEntity<Todo> create(@RequestBody Todo newTodo) {
         todoRepository.save(newTodo);
         return new ResponseEntity<>(newTodo, HttpStatus.OK);
    }

    @GetMapping("/todo")
    public ResponseEntity<Iterable<Todo>> getAll(){
       Iterable<Todo> allTodosInDb = (Iterable<Todo>) todoRepository.findAll();
       return new ResponseEntity<Iterable<Todo>>(allTodosInDb, HttpStatus.OK);
    }


}
