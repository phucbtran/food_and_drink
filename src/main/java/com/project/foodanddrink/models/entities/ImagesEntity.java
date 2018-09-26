package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "images", schema = "food_and_drink")
public class ImagesEntity {
    private Integer idImage;
    private String url;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private ProductsEntity productsByIdProduct;

    public ImagesEntity() {
    }

    @Id
    @Column(name = "id_image", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 500)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    public ProductsEntity getProductsByIdProduct() {
        return productsByIdProduct;
    }

    public void setProductsByIdProduct(ProductsEntity productsByIdProduct) {
        this.productsByIdProduct = productsByIdProduct;
    }
}
