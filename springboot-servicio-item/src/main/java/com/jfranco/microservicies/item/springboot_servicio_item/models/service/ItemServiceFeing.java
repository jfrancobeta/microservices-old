package com.jfranco.microservicies.item.springboot_servicio_item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfranco.microservicies.item.springboot_servicio_item.clientes.IProductoClienteRest;
import com.jfranco.microservicies.item.springboot_servicio_item.models.Item;

@Service("serviceFeing")
//@Primary
public class ItemServiceFeing implements ItemService{


    @Autowired
    private IProductoClienteRest productoClienteRest;

    @Override
    public List<Item> findAll() {
        return productoClienteRest.listar().stream().map(u -> new Item(u,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(productoClienteRest.detalle(id),cantidad);
    }

    
    
}
