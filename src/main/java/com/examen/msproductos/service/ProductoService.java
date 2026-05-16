package com.examen.msproductos.service;

import com.examen.msproductos.dto.ProductoRequestDto;
import com.examen.msproductos.entity.Producto;

import java.util.List;

public interface ProductoService {
    Producto crearProducto(ProductoRequestDto dto);


    List<Producto> listarProductos();

    Producto obtenerProductoPorId(Long id);

    Producto actualizarProducto(Long id, ProductoRequestDto dto);

    void eliminarProducto(Long id);
}
