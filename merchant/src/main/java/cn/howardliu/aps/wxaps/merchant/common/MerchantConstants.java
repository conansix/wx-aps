package cn.howardliu.aps.wxaps.merchant.common;

/**
 * <br/>create at 15-12-14
 *
 * @author liuxh
 * @since 1.0.0
 */
public final class MerchantConstants {
    private MerchantConstants() {
        throw new AssertionError("No cn.howardliu.aps.wxaps.merchant.common.MerchantConstants instances for you!");
    }

    /**
     * 增加商品
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/create?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String CREATE_PRODUCT = "https://api.weixin.qq.com/merchant/create?access_token=ACCESS_TOKEN";
    /**
     * 删除商品
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/del?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String DELETE_PRODUCT = "https://api.weixin.qq.com/merchant/del?access_token=ACCESS_TOKEN";
    /**
     * 修改商品
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/update?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String UPDATE_PRODUCT = "https://api.weixin.qq.com/merchant/update?access_token=ACCESS_TOKEN";
    /**
     * 查询商品
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/get?access_token=ACCESS_TOKEN
     * http请求方式：GET
     * post数据格式：json
     * </pre>
     */
    public static final String GET_PRODUCT = "https://api.weixin.qq.com/merchant/get?access_token=ACCESS_TOKEN";
    /**
     * 获取指定状态的所有商品
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/getbystatus?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String GET_BY_STATUS = "https://api.weixin.qq.com/merchant/getbystatus?access_token=ACCESS_TOKEN";
    /**
     * 商品上下架
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/modproductstatus?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String MOD_PRODUCT_STATUS = "https://api.weixin.qq.com/merchant/modproductstatus?access_token=ACCESS_TOKEN";
    /**
     * 获取指定分类的所有子分类
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/category/getsub?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String GET_SUB_CATEGORY = "https://api.weixin.qq.com/merchant/category/getsub?access_token=ACCESS_TOKEN";
    /**
     * 获取指定子分类的所有SKU
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/category/getsku?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String GET_SKU_BY_CATEGORY = "https://api.weixin.qq.com/merchant/category/getsku?access_token=ACCESS_TOKEN";
    /**
     * 获取指定分类的所有属性
     * <pre>
     * 协议：https
     * 请求url：https://api.weixin.qq.com/merchant/category/getproperty?access_token=ACCESS_TOKEN
     * http请求方式：POST
     * post数据格式：json
     * </pre>
     */
    public static final String GET_PROPERTY_BY_CATEGORY = "https://api.weixin.qq.com/merchant/category/getproperty?access_token=ACCESS_TOKEN";
}
