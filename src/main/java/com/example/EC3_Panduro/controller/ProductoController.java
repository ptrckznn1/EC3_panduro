package com.example.EC3_Panduro.controller;

import com.example.EC3_Panduro.model.Producto;
import com.example.EC3_Panduro.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> registrar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.registrar(producto));
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(productoService.obtenerPorId(id));
    }
}
