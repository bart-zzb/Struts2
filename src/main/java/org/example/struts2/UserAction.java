package org.example.struts2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

//实现Action接口创建Action对象
public class UserAction implements Action {
    @Override
    public String execute() throws Exception {
        //1 获取ActionContext
        ActionContext context = ActionContext.getContext();

        //2 调用方法得到值栈对象
        ValueStack valueStack1 = context.getValueStack();

        ValueStack valueStack2 = context.getValueStack();

        //返回true,每个Action都只有一个值栈对象
        System.out.println(valueStack1==valueStack2);

        return SUCCESS;
    }
}
