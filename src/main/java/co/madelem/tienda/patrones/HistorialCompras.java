package co.madelem.tienda.logica;

import java.util.List;
import java.util.ArrayList;

import co.madelem.tienda.dominio.Compra;

public class HistorialCompras {
    private static HistorialCompras instancia;
    private List<Compra> compras;

    private HistorialCompras() {
        this.compras = new ArrayList<>();
        System.out.println("Patrón Singleton (Singleton Pattern)");
    }

    public static synchronized HistorialCompras getInstance() {
        if (instancia == null) {
            instancia = new HistorialCompras();
        }
        return instancia;
    }

    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> getCompras() {
        return new ArrayList<>(compras);
    }
}
