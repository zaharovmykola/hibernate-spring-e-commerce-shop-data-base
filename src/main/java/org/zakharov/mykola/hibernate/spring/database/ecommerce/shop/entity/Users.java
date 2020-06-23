package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(mappedBy = "user_id")
    @Column(name="id")
    private long id;

    @Column(name="login", length=25)
    private String login;
    @Column(name="password", length=255) // redundant -  тоесть стандарт значение 255? или что?
    private String password;

    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "id")
    @Column(name="role_id")
    private Integer role_id;

    public Users() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}