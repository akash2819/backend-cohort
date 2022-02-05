package com.task.firstserver.service;

import com.task.firstserver.entities.Word;

import java.util.List;

public abstract class Wordservice {
// for get all
    public List<Word> getWord() {
        return null;
    }
//for get by value
    public Word getWord(long value) {
        return null;
    }
//for post
    public Word addWord(Word word) {
        return null;
    }
}
