/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Model.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author mauro
 */
public class ProductoRepositoryMemoria implements ProductoRepository{
   
    
    private final Map<Integer, Producto> datos = new HashMap<>();
    public void guardar(Producto p) {
        datos.put(p.getId(), p);
    }
    public Optional<Producto> buscarPorId(int id) {
        return Optional.ofNullable(datos.get(id));
    }
}
