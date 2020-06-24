package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="articles")
public class Articles extends AbstractEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//   // @OneToMany(mappedBy = "article_id")
//    @Column(name="id")
//    private long id;

    @Column(name="title", columnDefinition="CHAR(4)")  //  ???  char(4)
    private String title;
    @Column(name="description", length=500)
    private String description;
    @Column(name="price", columnDefinition="DECIMAL(10,0)")  // ??? decimal(10,0)
    private BigDecimal price;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="image", columnDefinition = "LONGTEXT")  //  ???  longtext
    private String image;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "category_id")
   // @Column(name="category_id") //???????????????????????????????
    private Category category;

    @OneToMany(mappedBy = "article")
    private Set<Orders> setOfWorkers = new HashSet<>(0);

    public Articles() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Orders> getSetOfWorkers() {
        return setOfWorkers;
    }

    public void setSetOfWorkers(Set<Orders> setOfWorkers) {
        this.setOfWorkers = setOfWorkers;
    }
}

