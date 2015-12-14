package cn.howardliu.aps.wxaps.merchant.pojo.group;

import java.util.List;

/**
 * <br/>create at 15-12-14
 *
 * @author liuxh
 * @since 1.0.0
 */
public class GroupDetail {
    private String groupId;// 分组ID
    private String groupName;// 分组名称
    private List<String> productList;// 商品ID集合

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}
