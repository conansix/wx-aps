package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Detail {
    private String text;// 文字描述
    private String img;// 图片(图片需调用图片上传接口获得图片Url填写至此，否则无法添加商品)

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
