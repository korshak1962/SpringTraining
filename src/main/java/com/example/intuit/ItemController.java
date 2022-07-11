package com.example.intuit;

import com.example.intuit.dao.Item;
import com.example.intuit.services.ItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class ItemController {

    Logger logger = LogManager.getLogger(ItemController.class);

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Root!";
    }

    @Autowired
    ItemService itemService;

    @RequestMapping("/allItems")
    public Collection<Item> allItems() {
        return itemService.getAllItems();
    }

    @RequestMapping("/itemById/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addItem")
    public void addItem(@RequestBody Item item) {
        logger.info(" got item =" + item);
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateItem/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable Long id) {
        logger.info(" update item =" + item + ", id=" + id);
        itemService.updateItem(id, item);
    }

    @RequestMapping("/deleteItemById/{id}")
    public void deleteItemById(@PathVariable Long id) {
        itemService.deleteItemById(id);
    }

}
