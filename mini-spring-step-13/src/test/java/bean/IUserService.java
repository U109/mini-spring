package bean;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description:
 */
public interface IUserService {
    String queryUserInfo();

    String register(String userName);
}
