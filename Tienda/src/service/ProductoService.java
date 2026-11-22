/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.Producto;
import repository.ProductoRepository;

/**
 *
 * @author mauro
 */
public class ProductoService {
    private final ProductoRepository repo;
    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }
    public void registrar(Producto p) {
        if (p.getNombre().isBlank())
            throw new IllegalArgumentException("Nombre vacío");
        repo.guardar(p);
    }
}
