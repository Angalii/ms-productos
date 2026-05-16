package com.examen.msproductos.controller;

import com.examen.msproductos.dto.ProductoRequestDto;
import com.examen.msproductos.entity.Producto;
import com.examen.msproductos.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Crear producto
    @PostMapping
    public Producto crearProducto(
            @Valid @RequestBody ProductoRequestDto dto) {

        return productoService.crearProducto(dto);
    }

    // Listar productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(
            @PathVariable Long id) {

        return productoService.obtenerProductoPorId(id);
    }

    // Actualizar
    @PutMapping("/{id}")
    public Producto actualizarProducto(
            @PathVariable Long id,
            @Valid @RequestBody ProductoRequestDto dto) {

        return productoService.actualizarProducto(id, dto);
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public void eliminarProducto(
            @PathVariable Long id) {

        productoService.eliminarProducto(id);
    }
}