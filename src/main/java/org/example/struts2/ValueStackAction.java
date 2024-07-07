package org.example.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport {

    //定义变量
    private String name;

    //生成变量的get方法
    public String getName() {
        return name;
    }

    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        //1 调用set方法给值栈添加元素
        valueStack.set("username", "Bart");

        //2 调用push方法给值栈添加元素
        valueStack.push("James ");

        //3 变量以及变量get方法(最常用)
        name = "abcdefghijklmnop";
        return SUCCESS;
    }
}
