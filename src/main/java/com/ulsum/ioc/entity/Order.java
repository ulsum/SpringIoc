package com.ulsum.ioc.entity;

public class Order {

    private Float price;
    private Integer quantity;
    private Float total;

    public Order() {
        System.out.println("创建Order对象" + this);
    }

    public void init() {
        System.out.println("执行init方法");
        total = price * quantity;
    }

    public void destroy() {
        System.out.println("释放与订单资源相关的资源");
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        System.out.println("设置price");
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        System.out.println("设置quantity");
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void pay() {
        System.out.println("订单金额 = " + total);
    }

}
