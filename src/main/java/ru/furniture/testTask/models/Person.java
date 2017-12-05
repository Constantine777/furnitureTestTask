package ru.furniture.testTask.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    private String name;
    private String surname;
    private String patronymic;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private List<Orderorder> orderorders = new ArrayList<>();

    public List<Orderorder> getOrderorders() { return orderorders; }

    public String getName() {
        return name;
    }

    public void setName(String mnemonic) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) { this.surname = surname; }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
