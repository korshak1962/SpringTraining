package com.example.intuit.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Container {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String number;

    @OneToMany(targetEntity=Item.class, mappedBy="container", fetch= FetchType.LAZY)
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", items=" + items +
                '}';
    }
}
