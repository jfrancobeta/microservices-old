package com.jfranco.microservicios.producto.springboot_servicio_productos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfranco.microservicios.producto.springboot_servicio_productos.models.entity.Producto;
import com.jfranco.microservicios.producto.springboot_servicio_productos.models.repository.ProductosDao;

@Service
public class ProductoServiceimpl implements IProductoService{

    @Autowired
    private ProductosDao productosDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return productosDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productosDao.findById(id).orElse(null);
    }
    
}
