package com.example.intuit.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Long> {

    public List<Item> findByContainerId(Long containerId);
}
