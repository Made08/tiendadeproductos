
package co.madelem.tienda.patrones;

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
