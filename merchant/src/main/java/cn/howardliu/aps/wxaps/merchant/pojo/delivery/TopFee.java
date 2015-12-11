package cn.howardliu.aps.wxaps.merchant.pojo.delivery;

/**
 * 具体运费计算
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class TopFee {
    private String Type;// 快递类型ID(参见增加商品/快递列表)
    private Normal normal;// 默认邮费计算方法
    private Custom custom;// 指定地区邮费计算方法

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }
}
