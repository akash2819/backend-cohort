package com.task.firstserver.service;

import com.task.firstserver.entities.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordServiceImpl extends Wordservice {
    List<Word> list;
    public WordServiceImpl(){
        list=new ArrayList<> ();
        list.add(new Word (1,"Akash"));
        list.add(new Word (2,"Sharma"));
    }

    @Override
    public List<Word> getWord(){
        return list;
    }
    @Override                         //for fetching data using value
    public Word getWord(long value){
        Word w=null;
        for (Word word:list) {
            if(word.getValue ()==value){
                w=word;
                break;
            }

        }
        return w;
    }

    @Override
    public Word addWord(Word word){
        list.add(word);
        return word;
    }
}
