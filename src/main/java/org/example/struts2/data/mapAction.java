package org.example.struts2.data;

import com.opensymphony.xwork2.ActionSupport;
import org.example.struts2.entity.User;

import java.util.Map;

public class mapAction extends ActionSupport {
    private Map<String,User> map;

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(map);
        return NONE;
    }
}
