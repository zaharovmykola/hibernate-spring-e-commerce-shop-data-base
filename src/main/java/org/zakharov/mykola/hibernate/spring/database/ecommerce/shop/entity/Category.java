package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Category")
public class Category extends AbstractEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    //@OneToMany(mappedBy = "category_id")
//    @Column(name="id")
//    private long id;

    @Column(name="name", length=25)
    private String name;

    @OneToMany(mappedBy = "category_id")
    private Set<Articles> setOfWorkers = new HashSet<>(0);

    public Category() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Articles> getSetOfWorkers() {
        return setOfWorkers;
    }

    public void setSetOfWorkers(Set<Articles> setOfWorkers) {
        this.setOfWorkers = setOfWorkers;
    }
}
