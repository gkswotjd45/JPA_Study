package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id@GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @JoinColumn(name="ORDER_ID")
    private Long orderId;
    @JoinColumn(name="ITEM_ID",insertable = false,updatable = false )
    private Long itemId;

    private  int orderPrice;
    private  int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder() {
        return orderId;
    }

    public void setOrder(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




}
