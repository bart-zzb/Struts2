package org.example.struts2.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.example.struts2.entity.User;

/**
 * 使用表达式封装数据到实体类对象
 */
public class dataAction3 extends ActionSupport {

    //1 声明实体类
    private User user;

    //2 生成实体类变量的set和get方法
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }

}
