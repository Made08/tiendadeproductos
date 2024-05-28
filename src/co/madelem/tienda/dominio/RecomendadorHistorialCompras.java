package co.madelem.tienda.dominio; 


public class RecomendadorHistorialCompras {

    public class RecomendadorHistorialCompras implements EstrategiaRecomendacion {
        @Override
        public List<Producto> recomendar(Usuario usuario, List<Producto> productos) {
            // Implementación de la recomendación basada en el historial de compras
            return productos.stream()
                    .filter(producto -> usuario.getHistorialCompras().contains(producto))
                    .collect(Collectors.toList());
        }
    }
    
    public class RecomendadorPreferenciasUsuario implements EstrategiaRecomendacion {
        @Override
        public List<Producto> recomendar(Usuario usuario, List<Producto> productos) {
            // Implementación de la recomendación basada en las preferencias del usuario
            return productos.stream()
                    .filter(producto -> producto.getCategoria().equals(usuario.getCategoriaPreferida()))
                    .collect(Collectors.toList());
        }
    }
    
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
    
}
