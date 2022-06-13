
package grupohazul.projeto01;

import java.util.List;


public interface IPessoaService {
    List<Pessoa>list();
    List<Pessoa> filter(String nome);
    Pessoa add(Pessoa p);
    Pessoa edit(Pessoa p);
    Pessoa delete(int id);
}
