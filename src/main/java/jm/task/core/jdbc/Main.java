package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {

    private final static UserService uS = new UserServiceImpl();
    public static void main(String[] args) {




        uS.createUsersTable();

        uS.saveUser("The Miz","Awesome",(byte) 1347);
    }
}
