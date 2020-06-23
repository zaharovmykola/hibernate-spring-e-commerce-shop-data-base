package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Articles")
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(mappedBy = "article_id")
    @Column(name="id")
    private long id;

    @Column(name="title", length=4)  //  ???  char(4)
    private String title;
    @Column(name="description", length=500)
    private String description;
    @Column(name="price")  // ??? decimal(10,0)
    private BigDecimal price;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="image")  //  ???  longtext
    private String image;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "id")
    @Column(name="category_id")
    private Integer category_id;

    public Articles() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}

