package co.madelem.tienda.logica; 

import java.util.List;
import java.util.Collectors;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.Producto;
import co.madelem.tienda.dominio.EstrategiaRecomendacion;

public class RecomendadorPreferenciasUsuario implements EstrategiaRecomendacion {
    @Override
    public List<Producto> recomendar(Usuario usuario, List<Producto> productos) {
        // Implementación de la recomendación basada en las preferencias del usuario
        return productos.stream()
                .filter(producto -> producto.getCategoria().equals(usuario.getCategoriaPreferida()))
                .collect(Collectors.toList());
    }
}