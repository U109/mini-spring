package zzz.springframework.core.io;

/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
