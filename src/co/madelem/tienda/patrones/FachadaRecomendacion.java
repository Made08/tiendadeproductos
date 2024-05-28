package co.madelem.tienda.patrones;

public class FachadaRecomendacion {

    private RecomendadorFactory RecomendadorFactory;
    
        public FachadaRecomendacion() {
            this.RecomendadorFactory = new RecomendadorFactory();
        }
    
        public List<Producto> obtenerRecomendaciones(String tipoEstrategia, Usuario usuario, List<Producto> productos) {
            EstrategiaRecomendacion estrategia = RecomendadorFactory.obtenerRecomendador(tipoEstrategia);
            return estrategia.recomendar(usuario, productos);
        }
    }
