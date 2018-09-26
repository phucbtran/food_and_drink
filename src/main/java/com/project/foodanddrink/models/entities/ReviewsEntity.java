package com.project.foodanddrink.models.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "reviews", schema = "food_and_drink")
public class ReviewsEntity {
    private Integer idReview;
    private Integer score;
    private String content;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp deleteAt;
    private ProductsEntity productsByIdProduct;

    public ReviewsEntity() {
    }

    @Id
    @Column(name = "id_review", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdReview() {
        return idReview;
    }

    public void setIdReview(Integer idReview) {
        this.idReview = idReview;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
