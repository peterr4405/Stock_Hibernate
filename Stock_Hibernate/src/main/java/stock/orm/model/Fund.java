package stock.orm.model;

import java.util.HashSet;
import java.util.Set;


public class Fund {
    
    private Integer fundid;
    private String name;
    private String desc;
    private Set<Stock> stocks = new HashSet<>();
    private FundNet fundnet;
    private Set<Trader> traders = new HashSet<>();

    public Integer getFundid() {
        return fundid;
    }

    public void setFundid(Integer fundid) {
        this.fundid = fundid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    public FundNet getFundnet() {
        return fundnet;
    }

    public void setFundnet(FundNet fundnet) {
        this.fundnet = fundnet;
    }

    public Set<Trader> getTraders() {
        return traders;
    }

    public void setTraders(Set<Trader> traders) {
        this.traders = traders;
    }

    public Fund() {
    }

    public Fund(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Fund{" + "fundid=" + fundid + ", name=" + name + ", desc=" + desc + ", stocks=" + stocks + ", fundnet=" + fundnet + ", traders=" + traders + '}';
    }
    
    
    
    
}

