package cn.howardliu.aps.wxaps.merchant.pojo.group;

/**
 * 分组的商品集合
 * <br/>create at 15-12-14
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Product {
    private String productId;// 商品ID
    private int modAction;// 修改操作(0-删除, 1-增加)

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getModAction() {
        return modAction;
    }

    public void setModAction(int modAction) {
        this.modAction = modAction;
    }
}
