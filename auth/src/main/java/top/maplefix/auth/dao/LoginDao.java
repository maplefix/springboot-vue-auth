package top.maplefix.auth.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import top.maplefix.auth.dto.SessionUserInfo;

import java.util.Set;

/**
 * @author: Maple
 * @description: 登录相关dao
 * @date: 2021/5/12 14:11
 */
public interface LoginDao {
    /**
     * 根据用户名和密码查询对应的用户
     */
    JSONObject checkUser(@Param("username") String username, @Param("password") String password);

    SessionUserInfo getUserInfo(String username);

    Set<String> getAllMenu();

    Set<String> getAllPermissionCode();
}
