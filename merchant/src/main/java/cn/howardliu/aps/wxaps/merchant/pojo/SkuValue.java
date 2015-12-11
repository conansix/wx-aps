package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class SkuValue {
    private String id;// vid
    private String name;// vid名称，如需自定义SKU，格式为"$xxx"，xxx即为显示在客户端中的字符串

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
}
