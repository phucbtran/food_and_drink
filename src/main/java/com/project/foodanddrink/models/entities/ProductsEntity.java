package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "food_and_drink")
public class ProductsEntity {
    private Integer idProduct;
    private String name;
    private String description;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private Collection<ImagesEntity> imagesByIdProduct;
    private CategoriesEntity categoriesByIdCategory;
    private Collection<ReviewsEntity> reviewsByIdProduct;
    private Collection<SizesOfFoodEntity> sizesOfFoodsByIdProduct;

    public ProductsEntity() {
    }

    @Id
    @Column(name = "id_product", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
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
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @OneToMany(mappedBy = "productsByIdProduct")
    public Collection<ImagesEntity> getImagesByIdProduct() {
        return imagesByIdProduct;
    }

    public void setImagesByIdProduct(Collection<ImagesEntity> imagesByIdProduct) {
        this.imagesByIdProduct = imagesByIdProduct;
    }

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category")
    public CategoriesEntity getCategoriesByIdCategory() {
        return categoriesByIdCategory;
    }

    public void setCategoriesByIdCategory(CategoriesEntity categoriesByIdCategory) {
        this.categoriesByIdCategory = categoriesByIdCategory;
    }

    @OneToMany(mappedBy = "productsByIdProduct")
    public Collection<ReviewsEntity> getReviewsByIdProduct() {
        return reviewsByIdProduct;
    }

    public void setReviewsByIdProduct(Collection<ReviewsEntity> reviewsByIdProduct) {
        this.reviewsByIdProduct = reviewsByIdProduct;
    }

    @OneToMany(mappedBy = "productsByIdProduct")
    public Collection<SizesOfFoodEntity> getSizesOfFoodsByIdProduct() {
        return sizesOfFoodsByIdProduct;
    }

    public void setSizesOfFoodsByIdProduct(Collection<SizesOfFoodEntity> sizesOfFoodsByIdProduct) {
        this.sizesOfFoodsByIdProduct = sizesOfFoodsByIdProduct;
    }
}
