package com.jfranco.microservicios.producto.springboot_servicio_productos.models.services;

import java.util.List;

import com.jfranco.microservicios.producto.springboot_servicio_productos.models.entity.Producto;

public interface IProductoService{

    public List<Producto> findAll();

    public Producto findById( Long id);


    
}
