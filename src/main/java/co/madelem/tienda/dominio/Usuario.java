package co.madelem.tienda.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String categoriaPreferida;
    private List<Producto> historialCompras;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.historialCompras = new ArrayList<>();
        System.out.println(toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoriaPreferida() {
        return categoriaPreferida;
    }

    public void setCategoriaPreferida(String categoriaPreferida) {
        this.categoriaPreferida = categoriaPreferida;
    }

    public List<Producto> getHistorialCompras() {
        return new ArrayList<>(historialCompras);
    }

    public void agregarCompra(Producto producto) {
        historialCompras.add(producto);
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", categoriaPreferida=" + categoriaPreferida + ", historialCompras="
                + historialCompras + "]";
    }

    
}
