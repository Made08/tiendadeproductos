package co.madelem.tienda.logica; 

import java.util.List;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.Producto;
import co.madelem.tienda.dominio.EstrategiaRecomendacion;

public class RecomendadorHistorialCompras implements EstrategiaRecomendacion {
    @Override
    public List<Producto> recomendar(Usuario usuario, List<Producto> productos) {
        // Implementación de la recomendación basada en el historial de compras
        return productos.stream()
                .filter(producto -> usuario.getHistorialCompras().contains(producto))
                .collect(Collectors.toList());
    }
}