package com.jfranco.microservicies.item.springboot_servicio_item.models.service;

import java.util.List;

import com.jfranco.microservicies.item.springboot_servicio_item.models.Item;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
    
}
