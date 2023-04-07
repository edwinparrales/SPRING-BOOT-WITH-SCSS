package col.main.sistemapos.servicio;

import col.main.sistemapos.entities.Producto;
import col.main.sistemapos.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService
{
    @Autowired
    private ProductoRepository pr;

    public List<Producto> listar()
    {
        return  pr.findAll();
    }

    public Producto guardar(Producto producto)
    {
        return pr.save(producto);
    }
    public boolean elminarId(Integer id)
    {
        if(pr.existsById(id)){
            pr.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public Producto buscarId(Integer id)
    {
        return pr.getById(id);

    }
}
