package zzz.springframework.beans;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:40
 * @description:
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
