package col.main.sistemapos.controllers;

import col.main.sistemapos.entities.Producto;
import col.main.sistemapos.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    private ProductoService ps;

    @GetMapping("")
    public String index(@ModelAttribute Producto producto)
    {
        //consultar las categorias pra enviarlas al modelview
        return "vistas/producto/productoIndex";
    }


    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar(){

        return new ResponseEntity<>(ps.listar(), HttpStatus.OK);
    }

    @PostMapping("/crear")

    public ResponseEntity<Producto> crear(@RequestBody Producto producto){

        return new ResponseEntity<>(ps.guardar(producto),HttpStatus.CREATED);

    }

   @DeleteMapping("/eliminar/{id}")
   public ResponseEntity eliminar(@PathVariable(name = "id" )Integer id){
        boolean eliminado = false;
        eliminado = ps.elminarId(id);

        if(eliminado){
            return new ResponseEntity(HttpStatus.GONE);
        }else{
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

   }

   @GetMapping("/editar/{id}")
   public ModelAndView editar(@PathVariable(name = "id" )Integer id){
        Producto productoA = ps.buscarId(id);
        ModelAndView mv = new ModelAndView();
       //Map<String,String> params = new HashMap<>();
       //params.put("nombre","Edwin Parrales");
        //mv.addObject(params);
        mv.addObject("nombre",productoA);
         mv.setViewName("productoEditar");
         return mv;
   }
   @PostMapping("/guardar")
   public String guardar(@ModelAttribute Producto producto){
        Producto prCreado = ps.guardar(producto);
        System.out.println("Producto creado : "+prCreado.toString());
       return "/vistas/producto/productoIndex";
   }
}
