package zzz.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;
/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */
public interface Resource {

    InputStream getInputStream() throws IOException;


}
