package cn.howardliu.aps.wxaps.commons.constant;

/**
 * <br/>create at 15-7-26
 *
 * @author liuxh
 * @since 1.0.0
 */
public final class CommonConfig {
    public static final String MAGIC_TOKEN = "7673858872";
    private static String appid;
    private static String appSecret;
    private static String token;
    private static String encodingAESKey;

    public CommonConfig(String appid, String appSecret, String token, String encodingAESKey) {
        CommonConfig.appid = appid;
        CommonConfig.appSecret = appSecret;
        CommonConfig.token = token;
        CommonConfig.encodingAESKey = encodingAESKey;
    }

    public static String getAppid() {
        return appid;
    }

    public static String getAppSecret() {
        return appSecret;
    }

    public static String getToken() {
        return token;
    }

    public static String getEncodingAESKey() {
        return encodingAESKey;
    }
}
