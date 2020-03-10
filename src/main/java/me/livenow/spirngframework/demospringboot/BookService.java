package me.livenow.spirngframework.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void printBookRepository(){
        System.out.println(bookRepository.getClass());
    }

    @PostConstruct //bean 주입 이후에 실행할 것 인터페이스 빈 라이프사이클
    public void setup(){
        System.out.println(bookRepository.getClass());
    }

}

