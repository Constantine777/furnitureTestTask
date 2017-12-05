package ru.furniture.testTask.models;

import javax.persistence.*;

public class Department{

    @Column
    private String departmentName;


    @OneToMany(fetch = FetchType.LAZY)
    private Person person;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
