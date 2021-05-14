package top.maplefix.auth.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author wangjg
 * @description 保存在session中的userinfo信息
 * @date 2021/5/12 17:31
 */
@Data
public class SessionUserInfo {

    private int userId;
    private String username;
    private String nickname;
    private List<Integer> roleIds;
    private Set<String> menuList;
    private Set<String> permissionList;
}
