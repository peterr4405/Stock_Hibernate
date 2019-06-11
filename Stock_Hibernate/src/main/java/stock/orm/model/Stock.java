package stock.orm.model;

import java.util.HashSet;
import java.util.Set;


public class Stock {
    
    private Integer stockid;
    private String stockCode;
    private String stockName;
    private Set<Fund>funds = new HashSet<>();

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Set<Fund> getFunds() {
        return funds;
    }

    public void setFunds(Set<Fund> funds) {
        this.funds = funds;
    }

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockid=" + stockid + ", stockCode=" + stockCode + ", stockName=" + stockName + ", funds=" + funds + '}';
    }
    
    
}
