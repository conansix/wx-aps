package cn.howardliu.aps.wxaps.merchant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 属性
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Property {
    private String id;// 属性id
    private String name;// 属性名称
    private final List<PropertyValue> propertyValue = new ArrayList<>();// 属性值

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PropertyValue> getPropertyValue() {
        return propertyValue;
    }
}
