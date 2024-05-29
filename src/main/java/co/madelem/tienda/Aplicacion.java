package co.madelem.tienda;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.Producto;
import co.madelem.tienda.dominio.Compra;

import co.madelem.tienda.logica.RecomendadorHistorialCompras;
import co.madelem.tienda.logica.RecomendadorPreferenciasUsuario;
import co.madelem.tienda.logica.RecomendadorTendenciasMercado;

import co.madelem.tienda.patrones.FachadaRecomendacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| 📝 Validacion Patrones de Diseño, UCC 2024                 |");
        System.out.println("| 👩🏻 Madelem Chico Velasco, Ingeniera de Sistemas            |");
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 🔔 Caso 3: Sistema de Tienda para Venta de Productos       |");
        System.out.println("+------------------------------------------------------------+");

        System.out.println("🔥Inicio Ejecucion: Sistema de Tienda\n");

        Usuario usuario = new Usuario("Juan Perez");
        usuario.setCategoriaPreferida("Categoría 1");
        List<Producto> productos = obtenerProductosDisponibles();
        
        System.out.println("\n");
        System.out.println("🛒Productos en Stock");
        productos.forEach(producto -> System.out.println(producto));

        FachadaRecomendacion fachadaRecomendacion = new FachadaRecomendacion();
        
        List<Producto> productosRecomendados = fachadaRecomendacion.obtenerRecomendaciones("historial", usuario, productos);
        
        // Mostrar productos recomendados
        productosRecomendados.forEach(producto -> System.out.println(producto.getNombre()));
    }
    
    private static List<Producto> obtenerProductosDisponibles() {
        // Retorna la lista de productos disponibles
        return Arrays.asList(
                new Producto("Producto 1", "Categoría 1"),
                new Producto("Producto 2", "Categoría 2"),
                new Producto("Lampara", "Categoría 1"),
                new Producto("Jabon de Aseo NEKO", "Categoría 1"),
                new Producto("Frijol Verde", "Categoría 1")
        );
    }
}