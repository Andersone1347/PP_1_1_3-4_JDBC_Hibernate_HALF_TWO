package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {

    private final static UserService uS = new UserServiceImpl();
    public static void main(String[] args) {


        uS.createUsersTable();          //  Создание таблицы User(ов)


        uS.saveUser("The Miz","Awesome",(byte) 13);        // Добавление User в таблицу
        uS.saveUser("The Face","not Awesome",(byte) 47);
        uS.saveUser("Andrey","Panov",(byte) 29);
        uS.saveUser("NeNastya","Wilson",(byte) 24);


        uS.getAllUsers();                        // Получение всех User(ов) из таблицы


        uS.cleanUsersTable();          // Очистка содержания таблицы


        uS.dropUsersTable();             //Удаление таблицы User(ов)


//        uS.removeUserById(5L);                      //   Удаление User из таблицы ( по id )


    }
}
