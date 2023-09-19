package com.xinyu.javalearn.generics.dao.testdao;

import com.xinyu.javalearn.generics.dao.BaseDaoImpl;

public class UsersService extends BaseDaoImpl<UsersDomain> {


    public static void main(String[] args) {

        UsersService usersService = new UsersService();

        UsersDomain usersDomain = new UsersDomain();

        UsersDomain select = usersService.select(usersDomain);


    }
}
