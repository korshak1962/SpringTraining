package com.example.intuit.dao;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Item {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "container_id")
    Container container;
    String name;
    String description;

    public Container getContainer() {
        return container;
    }

    public Item(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Item() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", container=" + container +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
