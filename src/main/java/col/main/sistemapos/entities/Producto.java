package col.main.sistemapos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rowid_producto")
    private Integer rowidProducto;
    @Column(nullable = false, unique = true)
    private String codigoBarras;
    @Column(nullable = false, unique = true)
    private String codigoInterno;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String presentacion;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)

    private Double valor;
    @Column(nullable = false)
    private Long cantidad;
    private String urlImagen;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    private Categoria categoria;

    public Producto() {

    }

    public Integer getRowidProducto() {
        return rowidProducto;
    }

    public void setRowidProducto(Integer rowidProducto) {
        this.rowidProducto = rowidProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "rowidProducto=" + rowidProducto +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", codigoInterno='" + codigoInterno + '\'' +
                ", nombre='" + nombre + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", cantidad=" + cantidad +
                ", urlImagen='" + urlImagen + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
