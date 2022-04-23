package com.fortun.credman.user.model.entity;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long idUser) {
        this.id = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameUser) {
        this.name = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwordUser) {
        this.password = passwordUser;
    }
}
