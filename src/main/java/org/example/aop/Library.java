package org.example.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(Book bookName){
        System.out.println("Мы берем книгу " + bookName.getName());
    }
}
