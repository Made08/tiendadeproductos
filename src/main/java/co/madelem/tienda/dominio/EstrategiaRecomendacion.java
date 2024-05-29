package co.madelem.tienda.dominio;

import java.util.List;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.Producto;

public interface EstrategiaRecomendacion {
    List<Producto> recomendar(Usuario usuario, List<Producto> productos);
}
