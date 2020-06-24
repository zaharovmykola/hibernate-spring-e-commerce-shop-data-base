package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class Users extends AbstractEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    //@OneToMany(mappedBy = "user_id")
//    @Column(name="id")
//    private long id;

    @Column(name="login", length=25)
    private String login;
    @Column(name="password", length=255) // redundant -  тоесть стандарт значение 255? или что?
    private String password;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "role_id")
    //@Column(name="role_id")  //???????????????????????????????
    private Roles role;

    @OneToMany(mappedBy = "user")
    private Set<Orders> setOfWorkers = new HashSet<>(0);

    public Users() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Set<Orders> getSetOfWorkers() {
        return setOfWorkers;
    }

    public void setSetOfWorkers(Set<Orders> setOfWorkers) {
        this.setOfWorkers = setOfWorkers;
    }
}
