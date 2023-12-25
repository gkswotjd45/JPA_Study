package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;
    private String name;
    private Integer price;
    private Integer stockQuanitity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStockQuanitity() {
        return stockQuanitity;
    }

    public void setStockQuanitity(Integer stockQuanitity) {
        this.stockQuanitity = stockQuanitity;
    }
}
