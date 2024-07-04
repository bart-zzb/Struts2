package org.example.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class FormAction2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第二种方式 使用ServletActionContext类获取
        //1.获取ActionContext对象
        HttpServletRequest request = ServletActionContext.getRequest();

        //2.调用request里面的方法得到结果
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        System.out.println(username+":"+password+":"+address);
        return NONE;
    }
}
