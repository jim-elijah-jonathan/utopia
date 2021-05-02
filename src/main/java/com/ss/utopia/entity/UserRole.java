package com.ss.utopia.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user_role")
public class UserRole {

    @Id
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userRole")
    List<User> users = new ArrayList<>();

    public UserRole(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public UserRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
