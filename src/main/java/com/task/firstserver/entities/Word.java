package com.task.firstserver.entities;

public class Word {
    private long value;
    private String word;

    //constructor
    public Word(long value,String word) {
        super();
        this.value = value;
        this.word= word;
    }
// default constructor
    public Word() {
        super();
    }
//getter for word
    public String getWord() {
        return word;
    }
//setter for word
    public void setWord(String word) {
        this.word = word;
    }


//    getter for value
    public long getValue() {
        return value;
    }
      //setter for value
    public void setValue(long value) {
        this.value = value;
    }

    //to string method
    @Override
    public String toString() {
        return "Word{" +
                "value=" + value +
                ", word='" + word + '\'' +
                '}';
    }
}
