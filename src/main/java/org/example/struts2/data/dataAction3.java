package org.example.struts2.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.example.struts2.entity.Book;
import org.example.struts2.entity.User;

/**
 * 使用表达式封装数据到实体类对象
 * 可以同时封装多个实体类
 */
public class dataAction3 extends ActionSupport {

    //1 先声明实体类
    private User user;

    private Book book;

    //2 生成实体类变量的set和get方法
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        System.out.println(book);
        return NONE;
    }

}
