package com.wt.test.springboot.controller;


import com.wt.test.springboot.entity.Book;
import com.wt.test.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 书本表 前端控制器
 * </p>
 *
 * @author qiyu
 * @since 2021-01-09
 */
@RestController
@RequestMapping("/book")
@Validated
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping ("/get/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookService.getById(id);
    }
}

