package org.example.struts2.data;

import com.opensymphony.xwork2.ActionSupport;
import org.example.struts2.entity.Book;
import org.example.struts2.entity.User;

import java.util.List;

/**
 * 封装到list
 */
public class listAction extends ActionSupport {

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return NONE;
    }
}
