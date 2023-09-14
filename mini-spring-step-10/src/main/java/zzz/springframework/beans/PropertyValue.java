package zzz.springframework.beans;

/**
 * @author: Zzz
 * @date: 2023/9/5 16:23
 * @description:
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
