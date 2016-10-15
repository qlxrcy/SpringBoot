package com.springboot.controllers;

import com.springboot.models.User;
import com.springboot.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qlxrc on 2016/10/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * GET /create  --> Create a new user and save it in the database.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(String password, String name) {
        String userId = "";
        try {
            User user = new User(password, name);
            userDao.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    /**
     * GET /delete  --> Delete the user having the passed id.
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            User user = new User(id);
            userDao.delete(user);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "User succesfully deleted!";
    }

    /**
     * GET /get-by-name  --> Return the id for the user having the name
     * name.
     */
    @RequestMapping("/get-by-name")
    @ResponseBody
    public String getByName(String name) {
        String userId = "";
        try {
            User user = userDao.findByName(name);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }

    /**
     * GET /update  --> Update the password and the name for the user in the
     * database having the passed id.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String password, String name) {
        try {
            User user = userDao.findOne(id);
            user.setPassword(password);
            user.setName(name);
            userDao.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return"Just Test!!!";
    }
    // Private fields

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
