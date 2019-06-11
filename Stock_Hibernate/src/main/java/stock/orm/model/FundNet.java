package stock.orm.model;


public class FundNet {
    
    private Integer netid;
    private Integer value;
    private Fund fund;

    public Integer getNetid() {
        return netid;
    }

    public void setNetid(Integer netid) {
        this.netid = netid;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    public FundNet() {
    }

    public FundNet(Integer netid, Integer value) {
        this.netid = netid;
        this.value = value;
    }

    @Override
    public String toString() {
        return "FundNet{" + "netid=" + netid + ", value=" + value + ", fund=" + fund + '}';
    }
    
    
    
}
