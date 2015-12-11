package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * sku信息列表(可为多个)，每个sku信息串即为一个确定的商品，比如白色的37码的鞋子
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Sku {
    // sku信息，参照上述sku_table的定义;
    // 格式："id1:vid1;id2:vid2"；
    // 规则：id_info的组合个数必须与sku_table个数一致(若商品无sku信息, 即商品为统一规格，则此处赋值为空字符串即可)
    private String skuId;
    private long oriPrice;// sku原价(单位 : 分)
    private long price;// sku微信价(单位 : 分, 微信价必须比原价小, 否则添加商品失败)
    private String iconUrl;// sku icon url(图片需调用图片上传接口获得图片Url)
    private int quantity;// sku库存
    private String product_code;// 商家商品编码

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public long getOriPrice() {
        return oriPrice;
    }

    public void setOriPrice(long oriPrice) {
        this.oriPrice = oriPrice;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }
}
