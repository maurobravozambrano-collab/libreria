/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import Model.Producto;
import repository.ProductoRepository;
import repository.ProductoRepositoryMemoria;
import service.ProductoService;

/**
 *
 * @author mauro
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoRepository repo = new ProductoRepositoryMemoria();
        
        ProductoService servicio=new ProductoService(repo);
        
        Producto p1=new Producto(1,"ARROZ");
        
        Producto p2=new Producto(2,"ATUN");
        
        servicio.registrar(p1);
        servicio.registrar(p2);
        
        repo.buscarPorId(1).ifPresent(p->{
           System.out.println(p.getNombre());
        });
    }
    
}
