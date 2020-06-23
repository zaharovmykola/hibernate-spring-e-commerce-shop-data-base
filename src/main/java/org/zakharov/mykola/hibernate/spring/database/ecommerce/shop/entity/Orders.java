package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class Orders extends AbstractEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="id")
//    private long id;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "id")
    //@Column(name="article_id")  //???????????????????????????????
    private Integer article_id;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "id")
   // @Column(name="user_id")  //???????????????????????????????
    private Integer user_id;

    @Column(name="quantity")
    private Integer quantity;

    public Orders() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
