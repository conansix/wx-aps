package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * 运费信息
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class DeliveryInfo {
    private int deliveryType;// 运费类型(0-使用下面express字段的默认模板, 1-使用template_id代表的邮费模板, 详见邮费模板相关API)
    private String template_id;// 邮费模板ID
    private Express express;

    public int getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public Express getExpress() {
        return express;
    }

    public void setExpress(Express express) {
        this.express = express;
    }
}
