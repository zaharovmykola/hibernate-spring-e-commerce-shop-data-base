package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Roles")
public class Roles extends AbstractEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    //@OneToMany(mappedBy = "role_id")
//    @Column(name="id")
//    private long id;

    @Column(name="name", length=25)
    private String name;

    @OneToMany(mappedBy = "role_id")
    private Set<Users> setOfWorkers = new HashSet<>(0);

    public Roles() {
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
}
