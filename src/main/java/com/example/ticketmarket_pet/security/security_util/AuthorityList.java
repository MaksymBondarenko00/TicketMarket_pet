package com.example.ticketmarket_pet.security.security_util;

public class AuthorityList {
    public static final String ROLE_USER = "USER";
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

    public static final String[] USER_LIST = {
            "/user/showUser/*"
    };

    public static final String[] ADMIN_LIST = {
            "/showUser/*",
            "/showUserInfo/*"
    };

    public static final String[] EMPLOYEE_LIST = {
            "/showUser/*"
    };
}
