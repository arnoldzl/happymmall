package com.mmall.common;

/**
 * @author: zinuo
 * @date: 2/5/2018
 * @descriptions:
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    // 内部接口常量分组
    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; // 管理员
    }

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
}
