package org.example.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.example.struts2.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class FormAction3 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第二种方式 使用ServletActionContext类获取
        //1.获取ActionContext对象
        HttpServletRequest request = ServletActionContext.getRequest();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        //2.封装到实体类对象里面
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);

        System.out.println(user);
        return NONE;
    }
}
