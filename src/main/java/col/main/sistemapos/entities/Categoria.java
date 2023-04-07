package col.main.sistemapos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rowid_categoria")
    private Integer rowidCategoria;
    @Column(unique = true,nullable = false)
    private String descripcion;
    private String urlImagen;


    public Integer getRowidCategoria() {
        return rowidCategoria;
    }

    public void setRowidCategoria(Integer rowidCategoria) {
        this.rowidCategoria = rowidCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    public Categoria(){}
    @Override
    public String toString() {
        return "Categoria{" +
                "rowidCategoria=" + rowidCategoria +
                ", descripcion='" + descripcion + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }
}
