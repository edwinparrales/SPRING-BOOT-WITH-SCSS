package col.main.sistemapos.repositorios;

import col.main.sistemapos.entities.DetalleFacturaProducto;
import col.main.sistemapos.entities.FacturaProductoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFacturaProducto, FacturaProductoPK> {
}
