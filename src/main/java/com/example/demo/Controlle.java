package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class Controlle {

    @Autowired
    private Repo repo;

    @GetMapping
    public List<Item> getItems(){
        return repo.findAll();
    }

    @PostMapping
    //curl -X POST -H "Content-Type: application/json" -d "{\"name\": \"Steven\"}" http://localhost:8080/items
    public Item addItem(@RequestBody Item item){
        return repo.save(item);
    }
}
