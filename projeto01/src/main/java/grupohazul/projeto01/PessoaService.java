
package grupohazul.projeto01;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaService implements IPessoaService{
    @Autowired
    private PessoaRepository repositorio;
    
    
    @Override
    public List<Pessoa> list() {
        return repositorio.findAll();
       
    }

    @Override
    public List<Pessoa> filter(String nome) {
        return repositorio.findAll().stream().filter(p->p.Nome.contains(nome)).collect(Collectors.toList());
    }

    @Override
    public Pessoa add(Pessoa p) {
        return repositorio.save(p);
    }

    @Override
    public Pessoa edit(Pessoa p) {
        return repositorio.save(p);
    }
    @Override
    public Pessoa delete(int id) {
        Pessoa p=repositorio.findOne(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}
