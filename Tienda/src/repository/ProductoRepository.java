/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import Model.Producto;
import java.util.Optional;

/**
 *
 * @author mauro
 */



public interface ProductoRepository {
   void guardar (Producto producto) ;
   Optional<Producto> buscarPorId(int id);
}
