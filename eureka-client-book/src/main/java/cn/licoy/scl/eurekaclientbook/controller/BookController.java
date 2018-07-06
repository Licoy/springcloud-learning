package cn.licoy.scl.eurekaclientbook.controller;

import cn.licoy.scl.eurekaclientbook.bean.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/6
 */
@RequestMapping(value = "/book")
@RestController
public class BookController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/list")
    public List<Book> list(){
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add(Book.builder().author("author-"+i).name("book-"+i).port(port).build());
        }
        return books;
    }

}
