package org.example.struts2;

import com.opensymphony.xwork2.Action;

//实现Action接口创建Action对象
public class UserAction implements Action {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
