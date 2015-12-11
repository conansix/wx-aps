package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * 商品其他属性
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class AttrExt {
    private int isPostFree;// 是否包邮(0-否, 1-是), 如果包邮delivery_info字段可省略
    private int isHasReceipt;// 是否提供发票(0-否, 1-是)
    private int isUnderGuaranty;// 是否保修(0-否, 1-是)
    private int isSupportReplace;// 是否支持退换货(0-否, 1-是)
    private Location location;// 商品所在地地址

    public int getIsPostFree() {
        return isPostFree;
    }

    public void setIsPostFree(int isPostFree) {
        this.isPostFree = isPostFree;
    }

    public int getIsHasReceipt() {
        return isHasReceipt;
    }

    public void setIsHasReceipt(int isHasReceipt) {
        this.isHasReceipt = isHasReceipt;
    }

    public int getIsUnderGuaranty() {
        return isUnderGuaranty;
    }

    public void setIsUnderGuaranty(int isUnderGuaranty) {
        this.isUnderGuaranty = isUnderGuaranty;
    }

    public int getIsSupportReplace() {
        return isSupportReplace;
    }

    public void setIsSupportReplace(int isSupportReplace) {
        this.isSupportReplace = isSupportReplace;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
