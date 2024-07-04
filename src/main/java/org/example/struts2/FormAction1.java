package org.example.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class FormAction1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第一种方式 使用ActionContext类获取
        //1.获取ActionContext对象
        ActionContext context = ActionContext.getContext();

        //2.调用方法得到表单数据
        Map<String, Object> parameters = context.getParameters();

        Set<String> keys = parameters.keySet();
        for (String key : keys) {
            //根据key得到value
            //数组形式:因为输入项里面可能有复选框
            Object[] value = (Object[])parameters.get(key);
            System.out.println(Arrays.toString(value));
        }
        return NONE;
    }
}
