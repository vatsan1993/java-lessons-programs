package Chap5.Ex7;

import java.util.Arrays;
import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;
    private int length;
    public Document(){
        authors= new String[5];
        date= new Date();
        length=0;
    }



    public Date getDate() {
        return date;
    }

    public int getLength() {
        return length;
    }

    public boolean addAuthor(String name){
        if(length<authors.length){
            authors[length]= name;
            length++;
            return true;
        }
        return false;
    }

    public boolean removeAuthor(){
        if (length>0){
            authors[length-1]= null;
            length--;
            return true;
        }
        return false;

    }
    public String getClassName(){
        return "Document";
    }

    public String getDetails(){
       return  "authors=" + getAuthors() +
        ", date=" + date.toString() ;
    }
    public String getAuthors(){
        StringBuffer buffer= new StringBuffer();
        for(int i= 0; i< length; i++){
            buffer.append(authors[i]);
            buffer.append(",");
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return  getClassName()+"{"
                 +getDetails()+"}";
    }
}
