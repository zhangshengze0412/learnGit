package top.zhangshengze.learn.auth;

import top.zhangshengze.learn.user.User;

import java.util.List;

/**
 * @className:
 * @description:
 * @author: ZSZ
 * @date: 2022/9/6 22:58
 */
public interface PermissionManagement {

    List<Permission> getPermissionByUserId(String userId);

    boolean checkPermission(User user,Permission permission);

}
