package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "categories", schema = "food_and_drink")
public class CategoriesEntity {
    private Integer idCategory;
    private String name;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private Collection<ProductsEntity> productsByIdCategory;

    public CategoriesEntity() {
    }

    @Id
    @Column(name = "id_category", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @OneToMany(mappedBy = "categoriesByIdCategory")
    public Collection<ProductsEntity> getProductsByIdCategory() {
        return productsByIdCategory;
    }

    public void setProductsByIdCategory(Collection<ProductsEntity> productsByIdCategory) {
        this.productsByIdCategory = productsByIdCategory;
    }
}
