package com.jfranco.microservicios.producto.springboot_servicio_productos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jfranco.microservicios.producto.springboot_servicio_productos.models.entity.Producto;
import com.jfranco.microservicios.producto.springboot_servicio_productos.models.services.IProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll().stream().map(u ->{
            u.setPort(port);
            return u;
        }).toList();
    }

    @GetMapping("/listar/{id}")
    public Producto listarId(@PathVariable Long id) {
        Producto producto =  productoService.findById(id);
        producto.setPort(port);

        //simulamos error 
        // boolean ok = false;
        // if(!ok){
        //     throw new RuntimeException("no se pudo cargar el producto");
        // }

        // try {
        //     Thread.sleep(2000L);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }


        return producto;
        
    }

}
