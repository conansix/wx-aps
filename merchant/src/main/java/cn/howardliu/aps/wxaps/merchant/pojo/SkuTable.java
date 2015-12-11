package cn.howardliu.aps.wxaps.merchant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class SkuTable {
    private String id;// sku id
    private String name;// sku 名称，支持自定义SKU，格式为"$xxx"，xxx即为显示在客户端中的字符串
    private final List<SkuValue> valueList = new ArrayList<>();// sku vid列表

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

    public List<SkuValue> getValueList() {
        return valueList;
    }
}
