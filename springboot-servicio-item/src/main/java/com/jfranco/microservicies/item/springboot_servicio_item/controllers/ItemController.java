package com.jfranco.microservicies.item.springboot_servicio_item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jfranco.microservicies.item.springboot_servicio_item.models.Item;
import com.jfranco.microservicies.item.springboot_servicio_item.models.Producto;
import com.jfranco.microservicies.item.springboot_servicio_item.models.service.ItemService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ItemController {

    @Autowired
    @Qualifier("serviceFeing")
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar() {
        return itemService.findAll();
    }

    @HystrixCommand(fallbackMethod = "metodoAlternativo")
    @GetMapping("/listar/{id}/{cantidad}")
    public Item detalles(@PathVariable Long id,@PathVariable Integer cantidad) {
        return itemService.findById(id, cantidad);
    }

    public Item metodoAlternativo(Long id,Integer cantidad) {
        Item item = new Item();
        Producto producto = new Producto();

        item.setCantidad(cantidad);
        producto.setId(id);
        producto.setNombre("sony");
        producto.setPrecio(200.20);
        item.setProducto(producto);

        return item;
    }


}
