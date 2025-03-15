package com.example.EC3_Panduro.service;

import com.example.EC3_Panduro.exception.ResourceNotFoundException;
import com.example.EC3_Panduro.model.Producto;
import com.example.EC3_Panduro.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto registrar(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado"));
    }
}
