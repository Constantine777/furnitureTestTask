package ru.furniture.testTask.models;

import javax.persistence.*;

@Entity
public class OrderType {
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
    private String typeName;

    @ManyToOne (fetch = FetchType.LAZY)
    private OrderTypeGroup typeGroup;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public OrderTypeGroup getTypeGroup() {
        return typeGroup;
    }

    public void setTypeGroup(OrderTypeGroup typeGroup) {
        this.typeGroup = typeGroup;
    }
}
