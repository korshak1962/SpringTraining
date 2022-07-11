package com.example.intuit.serviceImpl;

import com.example.intuit.dao.Item;
import com.example.intuit.dao.ItemRepository;
import com.example.intuit.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    Map<Long, Item> idToItems = new HashMap<>();

    @Override
    public Collection<Item> getAllItems() {
        Collection<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    @Override
    public Item getItemById(Long id) {
        return idToItems.get(id);
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Long id, Item item) {
        idToItems.put(id, item);
    }

    @Override
    public void deleteItemById(Long id) {
        idToItems.remove(id);
    }

}
