package com.ulsum.ioc.demo7.service;

import com.ulsum.ioc.demo7.dao.BookDao;

public class BookService {

    private BookDao bookDao;

    public void purchase() {
        System.out.println("正在执行图书采购业务方法");
        bookDao.insert();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
