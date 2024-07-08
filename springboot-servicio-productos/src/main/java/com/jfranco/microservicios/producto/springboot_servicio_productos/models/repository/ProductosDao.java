package com.jfranco.microservicios.producto.springboot_servicio_productos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.jfranco.microservicios.producto.springboot_servicio_productos.models.entity.Producto;

public interface ProductosDao extends JpaRepository<Producto,Long> {
    
}
