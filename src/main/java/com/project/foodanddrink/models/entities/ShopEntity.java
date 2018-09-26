package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "food_and_drink")
public class ShopEntity {
    private Integer idShop;
    private String address;
    private String phone;
    private String email;
    private String description;
    private Double averageShopCost;
    private String logo;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;

    public ShopEntity() {
    }

    @Id
    @Column(name = "id_shop", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
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
    @Column(name = "email", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "average_shop_cost", nullable = true, precision = 0)
    public Double getAverageShopCost() {
        return averageShopCost;
    }

    public void setAverageShopCost(Double averageShopCost) {
        this.averageShopCost = averageShopCost;
    }

    @Basic
    @Column(name = "logo", nullable = true, length = 500)
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopEntity that = (ShopEntity) o;
        return Objects.equals(idShop, that.idShop) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(description, that.description) &&
                Objects.equals(averageShopCost, that.averageShopCost) &&
                Objects.equals(logo, that.logo) &&
                Objects.equals(createAt, that.createAt) &&
                Objects.equals(updateAt, that.updateAt) &&
                Objects.equals(deleteAt, that.deleteAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShop, address, phone, email, description, averageShopCost, logo, createAt, updateAt, deleteAt);
    }
}
