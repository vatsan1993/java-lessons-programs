package Chap5.Ex7;

import java.util.Arrays;

public class Book extends Document{
    private String title;

    public Book(String title) {
        super();
        this.title = title;
    }



    public String getClassName(){
        return "Document";
    }
    public String getDetails(){
        return  super.getDetails()+"title='" + title + '\'' ;
    }
    @Override
    public String toString() {
        return  getClassName()+"{"
                +getDetails()+"}";
    }
}
