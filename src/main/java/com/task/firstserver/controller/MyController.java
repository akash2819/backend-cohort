package com.task.firstserver.controller;


import com.task.firstserver.entities.Word;
import com.task.firstserver.service.Wordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public Wordservice wordservice;

    //to get home page
    @GetMapping("/home")
    public String home (){
        return "hello world";
    }
    //to get  all words
    @GetMapping("/word")
    public List<Word> getWord(){
        return this.wordservice.getWord ();
    }
    //to get word by value
    @GetMapping("/word/{value}")
    public  Word getWord(@PathVariable String value){
        return this.wordservice.getWord (Long.parseLong (value));
    }
    //to post a word or to add new data
    @PostMapping("/word")
    public Word addWord(@RequestBody Word word){
        return this.wordservice.addWord(word);
    }

}
