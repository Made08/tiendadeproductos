package co.madelem.tienda.logica; 

import java.util.List;
import java.util.stream.Collectors;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.Producto;
import co.madelem.tienda.dominio.EstrategiaRecomendacion;

public class RecomendadorTendenciasMercado implements EstrategiaRecomendacion {
    @Override
    public List<Producto> recomendar(Usuario usuario, List<Producto> productos) {
        // Implementación de la recomendación basada en las tendencias del mercado
        List<Producto> productosTendencia = TendenciasMercado.getInstance().getProductosTendencia();
        return productos.stream()
                .filter(productosTendencia::contains)
                .collect(Collectors.toList());
    }
}