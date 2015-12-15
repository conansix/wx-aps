package cn.howardliu.aps.wxaps.commons.constant;

/**
 * <br/>create at 15-8-12
 *
 * @author liuxh
 * @since 1.0.0
 */
public final class CommonUrls {
    private CommonUrls() {
        throw new AssertionError("No cn.howardliu.aps.wxaps.commons.constant.CommonUrls instances for you!");
    }

    /**
     * 获取 access_token 接口
     */
    public static final String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
}
