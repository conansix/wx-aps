package cn.howardliu.aps.wxaps.merchant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Category {
    private String id;// 子分类ID
    private String name;// 子分类名称
    private Category parent;// 父级分类
    private final List<Category> children = new ArrayList<>();// 子分类

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<Category> getChildren() {
        return children;
    }
}
