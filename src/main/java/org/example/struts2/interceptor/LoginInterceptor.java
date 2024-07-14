package org.example.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        Object username = request.getSession().getAttribute("username");
        //判断
        if (username != null) {
            //登录状态
            //放行
            return actionInvocation.invoke();
        } else {
            //不是登录状态
            //到result标签中找"login"的结果页面
            return "login";
        }
    }
}
