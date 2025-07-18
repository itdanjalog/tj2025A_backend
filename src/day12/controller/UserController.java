package day12.controller;

import day12.model.dao.UserDao;

public class UserController {
    private UserController(){}
    private static final UserController instance = new UserController();
    public static UserController getInstance(){
        return instance;
    }

    private UserDao userDao = UserDao.getInstance();
}
