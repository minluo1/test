package com.test.my.dao;

import com.test.my.model.User;

public interface UserDAO {
 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
     
     
}
