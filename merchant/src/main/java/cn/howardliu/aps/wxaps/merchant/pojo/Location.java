package cn.howardliu.aps.wxaps.merchant.pojo;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Location {
    private String country;// 国家(详见《地区列表》说明)
    private String province;// 省份(详见《地区列表》说明)
    private String city;// 城市(详见《地区列表》说明)
    private String address;// 地址

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
