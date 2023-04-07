package col.main.sistemapos.repositorios;

import col.main.sistemapos.entities.Categoria;
import col.main.sistemapos.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {

    public Producto findProductoByCodigoBarras(String codigoBarras);
    public List<Producto> findByNombreLike(String nombres);
    public List<Producto> findByCategoria(Categoria categoria);

}
