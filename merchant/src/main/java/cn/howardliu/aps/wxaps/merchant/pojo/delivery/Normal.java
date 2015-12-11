package cn.howardliu.aps.wxaps.merchant.pojo.delivery;

/**
 * 默认邮费计算方法
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class Normal {
    private int atartStandards;// 起始计费数量(比如计费单位是按件, 填2代表起始计费为2件)
    private long atartFees;// 起始计费金额(单位: 分）
    private int addStandards;// 递增计费数量
    private long addFees;// 递增计费金额(单位 : 分)

    public int getAtartStandards() {
        return atartStandards;
    }

    public void setAtartStandards(int atartStandards) {
        this.atartStandards = atartStandards;
    }

    public long getAtartFees() {
        return atartFees;
    }

    public void setAtartFees(long atartFees) {
        this.atartFees = atartFees;
    }

    public int getAddStandards() {
        return addStandards;
    }

    public void setAddStandards(int addStandards) {
        this.addStandards = addStandards;
    }

    public long getAddFees() {
        return addFees;
    }

    public void setAddFees(long addFees) {
        this.addFees = addFees;
    }
}
