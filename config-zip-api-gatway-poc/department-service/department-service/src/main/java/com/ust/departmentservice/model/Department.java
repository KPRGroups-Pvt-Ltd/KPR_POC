package com.ust.departmentservice.model;
/**
 * Created by Sangharatna Davane
 * Date : 27-03-2024
 * Time : 19:34
 * Project Name :KPR_POC
 */
import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private List<Employee> list = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public Department(Long id, String name, List<Employee> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
