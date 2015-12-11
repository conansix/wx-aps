package cn.howardliu.aps.wxaps.merchant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Spu {
    private String productId;//商品ID
    private ProductBase productBase;// 基本属性
    private final List<Sku> skuList = new ArrayList<>();// sku信息列表(可为多个)，每个sku信息串即为一个确定的商品，比如白色的37码的鞋子
    private AttrExt attrext;// 商品其他属性
    private DeliveryInfo deliveryInfo;// 运费信息
    private int status;// 商品状态(0-全部, 1-上架, 2-下架)\

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductBase getProductBase() {
        return productBase;
    }

    public void setProductBase(ProductBase productBase) {
        this.productBase = productBase;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public AttrExt getAttrext() {
        return attrext;
    }

    public void setAttrext(AttrExt attrext) {
        this.attrext = attrext;
    }

    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
