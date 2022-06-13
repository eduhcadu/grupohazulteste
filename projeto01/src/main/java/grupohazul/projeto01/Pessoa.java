
package grupohazul.projeto01;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    public String Nome;
    @Column
    private int Idade;
    @Column
    private String Setor;

     public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }
    
    
    
}
