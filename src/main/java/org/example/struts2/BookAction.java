package org.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    //添加
    public String add() {
        System.out.println("add......");
        return NONE;
    }

    //更新
    public String update() {
        System.out.println("update.....");
        return NONE;
    }
}
