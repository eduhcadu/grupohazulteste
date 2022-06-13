
package grupohazul.projeto01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/pessoa"})
public class Controlador {
    
    @Autowired
    IPessoaService service;
    
    @GetMapping
    public List<Pessoa>list(){
        return service.list();
    }
    
    @PostMapping
    public Pessoa adicionar(@RequestBody Pessoa p){
       return service.add(p);
    }
    
    @GetMapping(path = {"/{nome}"})
    public List<Pessoa> listId(@PathVariable("nome") String nome){
        return service.filter(nome);
    }
    
    @PutMapping(path = {"/{id}"})
    public Pessoa editar(@RequestBody Pessoa p, @PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Pessoa delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
}
