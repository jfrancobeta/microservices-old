package com.jfranco.microservicies.item.springboot_servicio_item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jfranco.microservicies.item.springboot_servicio_item.models.Producto;

@FeignClient(name = "servicio-productos") // declarar que es u cliente feing y poner el nombre del cliente en el caso el microservicio productos
public interface IProductoClienteRest { //otra forma de acceder como el rest template

    @GetMapping("/listar")// al endpoint al que nos conectaremso
    public List<Producto> listar();

    
    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id);


}
