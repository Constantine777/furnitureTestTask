package ru.furniture.testTask.models;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity

public class Orderorder {
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
    private String mnemonic;

    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

}
