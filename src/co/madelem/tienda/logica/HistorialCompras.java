package co.madelem.tienda.logica;

public class HistorialCompras {
    private static HistorialCompras instancia;
    private List<Compra> compras;

    private HistorialCompras() {
        this.compras = new ArrayList<>();
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
