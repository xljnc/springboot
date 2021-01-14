package com.wt.test.springboot.service.impl;

import com.wt.test.springboot.entity.Book;
import com.wt.test.springboot.mapper.BookMapper;
import com.wt.test.springboot.service.BookService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书本表 服务实现类
 * </p>
 *
 * @author qiyu
 * @since 2021-01-09
 */
@Service
public class BookServiceImpl extends BaseServiceImpl<BookMapper, Book> implements BookService {

}
