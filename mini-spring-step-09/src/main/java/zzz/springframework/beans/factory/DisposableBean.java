package zzz.springframework.beans.factory;

/**
 * @author zhangzhongzhen wrote on 2023/9/7
 * @version 1.0
 */
public interface DisposableBean {

    void destroy() throws Exception;


}
