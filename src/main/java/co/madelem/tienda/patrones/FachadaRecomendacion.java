package co.madelem.tienda.patrones;

import java.util.List;

import co.madelem.tienda.dominio.Usuario;
import co.madelem.tienda.dominio.EstrategiaRecomendacion;
import co.madelem.tienda.dominio.Producto;

public class FachadaRecomendacion {
    private FabricaRecomendador fabricaRecomendador;

    public FachadaRecomendacion() {
        this.fabricaRecomendador = new FabricaRecomendador();
        System.out.println("Patrón Fachada (Facade Pattern)");
    }

    public List<Producto> obtenerRecomendaciones(String tipoEstrategia, Usuario usuario, List<Producto> productos) {
        EstrategiaRecomendacion estrategia = fabricaRecomendador.obtenerRecomendador(tipoEstrategia);
        return estrategia.recomendar(usuario, productos);
    }
}
