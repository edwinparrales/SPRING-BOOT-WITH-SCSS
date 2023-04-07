package col.main.sistemapos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FACTURAS")
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rowid_factura")
    private  Integer rowidFactura;

    private String codigoFactura;
    @Temporal(TemporalType.DATE)
    private Date fechaFactura;
    private String observacines;
    private Double desTotal;
    private Double impTotal;
    @ManyToOne
    @JoinColumn(name = "rowid_cliente",insertable = false,updatable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "factura")
    private List<DetalleFacturaProducto> listaProductos;



    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getObservacines() {
        return observacines;
    }

    public void setObservacines(String observacines) {
        this.observacines = observacines;
    }

    public Double getDesTotal() {
        return desTotal;
    }

    public void setDesTotal(Double desTotal) {
        this.desTotal = desTotal;
    }

    public Double getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(Double impTotal) {
        this.impTotal = impTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




}
