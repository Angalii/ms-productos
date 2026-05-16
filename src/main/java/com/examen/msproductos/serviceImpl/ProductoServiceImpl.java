package com.examen.msproductos.serviceImpl;

import com.examen.msproductos.dto.ProductoRequestDto;
import com.examen.msproductos.entity.Producto;
import com.examen.msproductos.exception.ProductoNotFoundException;
import com.examen.msproductos.repository.ProductoRepository;
import com.examen.msproductos.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto crearProducto(ProductoRequestDto dto) {
        Producto producto = Producto.builder()
                .nombre(dto.getNombre())
                .descripcion(dto.getDescripcion())
                .precio(dto.getPrecio())
                .stock(dto.getStock())
                .estado(dto.getEstado())
                .build();

        return productoRepository.save(producto);
    }


    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

    @Override
    public Producto actualizarProducto(Long id, ProductoRequestDto dto) {
        Producto producto = obtenerProductoPorId(id);

        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        producto.setEstado(dto.getEstado());

        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {

        Producto producto = obtenerProductoPorId(id);

        productoRepository.delete(producto);
    }
}