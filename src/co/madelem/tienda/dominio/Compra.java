package co.madelem.tienda.dominio;

import java.util.Date;

public class Compra {
    private Producto producto;
    private Date fechaCompra;

    public Compra(Producto producto) {
        this.producto = producto;
        this.fechaCompra = new Date();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}