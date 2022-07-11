package com.example.intuit.services;

import com.example.intuit.dao.Item;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


public interface ItemService {
    public Collection<Item> getAllItems();
    public Item getItemById(Long id);
    public void addItem(Item item);
    public void updateItem(Long id,Item item);
    public void deleteItemById(Long id);
}
