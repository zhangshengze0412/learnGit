package top.zhangshengze.learn;

/**
 * @className:
 * @description:
 * @author: ZSZ
 * @date: 2022/9/6 22:53
 */
public interface UserManagement {

    User login(String userId);

    User logout(String userId);

}
