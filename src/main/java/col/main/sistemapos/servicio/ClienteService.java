package col.main.sistemapos.servicio;

import col.main.sistemapos.entities.Cliente;
import col.main.sistemapos.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository cr;

    List<Cliente> listar(){
       return cr.findAll();
    }

}
