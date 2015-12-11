package cn.howardliu.aps.wxaps.merchant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class ProductBase {
    private String name;// 必选，商品名称
    private final List<String> categoryId = new ArrayList<>();// 必选，商品分类id，商品分类列表请通过《获取指定分类的所有子分类》获取
    private String mainImg;// 必选，商品主图(图片需调用图片上传接口获得图片Url填写至此，否则无法添加商品。图片分辨率推荐尺寸为640×600)
    private final List<String> img = new ArrayList<>();// 必选，商品图片列表(图片需调用图片上传接口获得图片Url填写至此，否则无法添加商品。图片分辨率推荐尺寸为640×600)
    private final List<Detail> detail = new ArrayList<>();// 必选，商品详情列表，显示在客户端的商品详情页内
    private final List<Property> property = new ArrayList<>();// 商品属性列表，属性列表请通过《获取指定分类的所有属性》获取
    private SkuTable skuInfo;// 商品sku定义，SKU列表请通过《获取指定子分类的所有SKU》获取
    private int buyLimit;// 用户商品限购数量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCategoryId() {
        return categoryId;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public List<String> getImg() {
        return img;
    }

    public List<Detail> getDetail() {
        return detail;
    }

    public List<Property> getProperty() {
        return property;
    }

    public SkuTable getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(SkuTable skuInfo) {
        this.skuInfo = skuInfo;
    }

    public int getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }
}
