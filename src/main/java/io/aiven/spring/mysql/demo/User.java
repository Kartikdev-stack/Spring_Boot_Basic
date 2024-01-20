package io.aiven.spring.mysql.demo;

import jakarta.persistence.*;

//hibernate does the job of transforming the whole code for MYSQL use...it basically converts this code to a table in MYSQL

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //strategy = GenerationType.IDENTITY is used to set Primary keys as MYSQL does not allow creating table without primary keys
    private Integer id;
    private String name;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
