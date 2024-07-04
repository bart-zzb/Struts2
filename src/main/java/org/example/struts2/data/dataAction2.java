package org.example.struts2.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.example.struts2.entity.User;

/**
 * 使用模型驱动获取表单数据
 */
public class dataAction2 extends ActionSupport implements ModelDriven<User> {
    //创建对象
    //前提要求:表单输入项属性值要和实体类属性值名称一样
    private User user = new User();

    @Override
    public User getModel() {
        //返回创建user对象
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }

}
