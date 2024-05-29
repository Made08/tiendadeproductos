
package co.madelem.tienda.patrones;

import co.madelem.tienda.dominio.EstrategiaRecomendacion;
import co.madelem.tienda.logica.RecomendadorHistorialCompras;
import co.madelem.tienda.logica.RecomendadorPreferenciasUsuario;
import co.madelem.tienda.logica.RecomendadorTendenciasMercado;


public class RecomendadorFactory {
   public EstrategiaRecomendacion obtenerRecomendador(String tipoEstrategia) {
            switch (tipoEstrategia) {
                case "historial":
                    return new RecomendadorHistorialCompras();
                case "preferencias":
                    return new RecomendadorPreferenciasUsuario();
                case "tendencias":
                    return new RecomendadorTendenciasMercado();
                default:
                    throw new IllegalArgumentException("Tipo de estrategia desconocido");
            }
        }
    }
    
}
