package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_detail", schema = "food_and_drink")
public class OrderDetailEntity {
    private Integer idOrderDetail;
    private Double prime;
    private Integer quantity;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private OrdersEntity ordersByIdOrder;
    private SizesOfFoodEntity sizesOfFoodByIdSize;

    public OrderDetailEntity() {
    }

    @Id
    @Column(name = "id_order_detail", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    @Basic
    @Column(name = "prime", nullable = true, precision = 0)
    public Double getPrime() {
        return prime;
    }

    public void setPrime(Double prime) {
        this.prime = prime;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "create_at", nullable = false)
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Basic
    @Column(name = "update_at", nullable = false)
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Basic
    @Column(name = "delete_at", nullable = false)
    public Timestamp getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Timestamp deleteAt) {
        this.deleteAt = deleteAt;
    }


    @ManyToOne
    @JoinColumn(name = "id_order", referencedColumnName = "id_order")
    public OrdersEntity getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder(OrdersEntity ordersByIdOrder) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne
    @JoinColumn(name = "id_size", referencedColumnName = "id_size")
    public SizesOfFoodEntity getSizesOfFoodByIdSize() {
        return sizesOfFoodByIdSize;
    }

    public void setSizesOfFoodByIdSize(SizesOfFoodEntity sizesOfFoodByIdSize) {
        this.sizesOfFoodByIdSize = sizesOfFoodByIdSize;
    }
}
