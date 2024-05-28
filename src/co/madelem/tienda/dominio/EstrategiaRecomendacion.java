package co.madelem.tienda.dominio;

public interface EstrategiaRecomendacion {
    List<Producto> recomendar(Usuario usuario, List<Producto> productos);
}
