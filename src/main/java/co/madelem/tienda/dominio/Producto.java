package co.madelem.tienda.dominio;

public class Producto {
    private String nombre;
    private String categoria;

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return nombre.equals(producto.nombre) && categoria.equals(producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, categoria);
    }
}
