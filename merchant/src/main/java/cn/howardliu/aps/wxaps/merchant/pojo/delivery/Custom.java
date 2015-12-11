package cn.howardliu.aps.wxaps.merchant.pojo.delivery;

/**
 * 指定地区邮费计算方法
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Custom {
    private int StartStandards;// 起始计费数量
    private long StartFees;// 起始计费金额(单位: 分）
    private int AddStandards;// 递增计费数量
    private long AddFees;// 递增计费金额(单位 : 分)
    private String DestCountry;// 指定国家(详见《地区列表》说明)
    private String DestProvince;// 指定省份(详见《地区列表》说明)
    private String DestCity;// 指定城市(详见《地区列表》说明)

    public int getStartStandards() {
        return StartStandards;
    }

    public void setStartStandards(int startStandards) {
        StartStandards = startStandards;
    }

    public long getStartFees() {
        return StartFees;
    }

    public void setStartFees(long startFees) {
        StartFees = startFees;
    }

    public int getAddStandards() {
        return AddStandards;
    }

    public void setAddStandards(int addStandards) {
        AddStandards = addStandards;
    }

    public long getAddFees() {
        return AddFees;
    }

    public void setAddFees(long addFees) {
        AddFees = addFees;
    }

    public String getDestCountry() {
        return DestCountry;
    }

    public void setDestCountry(String destCountry) {
        DestCountry = destCountry;
    }

    public String getDestProvince() {
        return DestProvince;
    }

    public void setDestProvince(String destProvince) {
        DestProvince = destProvince;
    }

    public String getDestCity() {
        return DestCity;
    }

    public void setDestCity(String destCity) {
        DestCity = destCity;
    }
}
