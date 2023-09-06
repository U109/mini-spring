import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 */
public class UserDao {

    private static final Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
