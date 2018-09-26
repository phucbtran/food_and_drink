package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "food_and_drink")
public class OrdersEntity {
    private Integer idOrder;
    private Integer status;
    private String address;
    private String phone;
    private String note;
    private Double shipCost;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private Collection<OrderDetailEntity> orderDetailsByIdOrder;

    public OrdersEntity() {
    }

    @Id
    @Column(name = "id_order", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "ship_cost", nullable = true, precision = 0)
    public Double getShipCost() {
        return shipCost;
    }

    public void setShipCost(Double shipCost) {
        this.shipCost = shipCost;
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

    @OneToMany(mappedBy = "ordersByIdOrder")
    public Collection<OrderDetailEntity> getOrderDetailsByIdOrder() {
        return orderDetailsByIdOrder;
    }

    public void setOrderDetailsByIdOrder(Collection<OrderDetailEntity> orderDetailsByIdOrder) {
        this.orderDetailsByIdOrder = orderDetailsByIdOrder;
    }
}
