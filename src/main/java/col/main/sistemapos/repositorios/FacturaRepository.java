package col.main.sistemapos.repositorios;

import col.main.sistemapos.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Integer> {
}
