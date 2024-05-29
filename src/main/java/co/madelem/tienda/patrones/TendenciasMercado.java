package co.madelem.tienda.logica;

import java.util.List;
import java.util.ArrayList;

import co.madelem.tienda.dominio.Producto;

public class TendenciasMercado {
    private static TendenciasMercado instancia;
    private List<Producto> productosTendencia;

    private TendenciasMercado() {
        this.productosTendencia = new ArrayList<>();
    }

    public static synchronized TendenciasMercado getInstance() {
        if (instancia == null) {
            instancia = new TendenciasMercado();
        }
        return instancia;
    }

    public void agregarProductoTendencia(Producto producto) {
        productosTendencia.add(producto);
    }

    public List<Producto> getProductosTendencia() {
        return new ArrayList<>(productosTendencia);
    }
}
