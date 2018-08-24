package com.app.web;

import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    UserDao userDao;

    @RequestMapping("getUser")
    public Optional<User> selectUserById(@RequestParam Integer id, HttpServletRequest request) {
        Optional<User> byId = userDao.findById(id);
        return byId;
    }

    @RequestMapping("listUser")
    public List<User> list() {
        return userDao.findAll();
    }

    @RequestMapping("add")
    public void add(User user) {
        userDao.save(user);
    }
}
