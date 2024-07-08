package com.jfranco.microservicies.item.springboot_servicio_item.models;

import java.util.Date;

public class Producto {

    private Long id;

    private String nombre;

    private Double precio;

    private Date CreateAt;

    private Integer port;

    public Long getId() {
        return id;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }

}
