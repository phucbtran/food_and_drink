package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "sizes_of_food", schema = "food_and_drink")
public class SizesOfFoodEntity {
    private Integer idSize;
    private String name;
    private Double price;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private Collection<OrderDetailEntity> orderDetailsByIdSize;
    private ProductsEntity productsByIdProduct;

    public SizesOfFoodEntity() {
    }

    @Id
    @Column(name = "id_size", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdSize() {
        return idSize;
    }

    public void setIdSize(Integer idSize) {
        this.idSize = idSize;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    @OneToMany(mappedBy = "sizesOfFoodByIdSize")
    public Collection<OrderDetailEntity> getOrderDetailsByIdSize() {
        return orderDetailsByIdSize;
    }

    public void setOrderDetailsByIdSize(Collection<OrderDetailEntity> orderDetailsByIdSize) {
        this.orderDetailsByIdSize = orderDetailsByIdSize;
    }

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    public ProductsEntity getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct(ProductsEntity productsByIdProduct) {
        this.productsByIdProduct = productsByIdProduct;
    }
}
