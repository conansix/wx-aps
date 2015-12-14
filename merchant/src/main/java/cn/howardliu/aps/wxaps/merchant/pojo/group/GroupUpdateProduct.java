package cn.howardliu.aps.wxaps.merchant.pojo.group;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>create at 15-12-14
 *
 * @author liuxh
 * @since 1.0.0
 */
public class GroupUpdateProduct {
    private String groupId;// 分组ID
    private final List<Product> product = new ArrayList<>();// 分组的商品集合

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Product> getProduct() {
        return product;
    }
}
