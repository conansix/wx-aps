package cn.howardliu.aps.wxaps.merchant.pojo.delivery;

/**
 * <br/>create at 15-12-11
 *
 * @author liuxh
 * @since 1.0.0
 */
public class DeliveryTemplate {
    private String templateId;// 邮费模板ID
    private String name;// 邮费模板名称
    private int assumer;// 支付方式(0-买家承担运费, 1-卖家承担运费)
    private int valuation;// 计费单位(0-按件计费, 1-按重量计费, 2-按体积计费，目前只支持按件计费，默认为0)
    private TopFee topFee;// 具体运费计算

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssumer() {
        return assumer;
    }

    public void setAssumer(int assumer) {
        this.assumer = assumer;
    }

    public int getValuation() {
        return valuation;
    }

    public void setValuation(int valuation) {
        this.valuation = valuation;
    }

    public TopFee getTopFee() {
        return topFee;
    }

    public void setTopFee(TopFee topFee) {
        this.topFee = topFee;
    }
}
