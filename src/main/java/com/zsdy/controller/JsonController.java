package com.zsdy.controller;

import com.zsdy.enity.User;
import com.zsdy.json.MyJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zsdy
 * @create 2019-08-02 11:39
 **/
@RestController
public class JsonController {

    @Autowired
    private MyJsonService myJsonService;

    @RequestMapping(value = "json")
    public String beanToJson() {
        User user = new User();
        user.setName("小明");
        user.setAge(20);
        String toJson = myJsonService.objToJson(user);
        return toJson;
    }
}
