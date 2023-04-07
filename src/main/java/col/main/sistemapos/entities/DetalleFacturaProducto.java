package col.main.sistemapos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "FACTURA_DETALLE")
public class DetalleFacturaProducto implements Serializable {
    @EmbeddedId
    private FacturaProductoPK idDteFactura;
    private Integer cantidad;
    private String observaciones;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "rowid_factura",insertable = false,updatable = false)
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "rowid_producto",insertable = false,updatable = false)
    private Producto producto;

    public FacturaProductoPK getIdDteFactura() {
        return idDteFactura;
    }

    public void setIdDteFactura(FacturaProductoPK idDteFactura) {
        this.idDteFactura = idDteFactura;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
