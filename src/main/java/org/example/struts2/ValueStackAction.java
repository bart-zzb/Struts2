package org.example.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.example.struts2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ValueStackAction extends ActionSupport {

    //定义变量
    private String name;

    //生成变量的get方法
    public String getName() {
        return name;
    }

    private User user;
    public User getUser() {
        return user;
    }

    private List<User> list = new ArrayList<User>();
    public List<User> getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        //1 调用set方法给值栈添加元素, 会放到root, root底层是list
        valueStack.set("username", "Bart");

        //2 调用push方法给值栈添加元素, 会放到root, root底层是list
        valueStack.push("James ");

        //3 变量以及变量get方法(最常用), 会放到context里面, context底层是的map集合
        name = "abcdefghijklmnop";

        //4 向值栈中放对象, 会放到context里面, context底层是的map集合
        user = new User();
        user.setUsername("Bart");
        user.setPassword("abcdefghijklmnop");
        user.setAddress("HongKong");

        //5 向值栈中放入list集合, 会放到context里面, context底层是的map集合
        list.add(user);

        return SUCCESS;
    }
}
