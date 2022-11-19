import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa implements Cadastravel {
    private String email;
    private List<Materia> materia = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    public Professor(String nome, int idade, String rg, Endereco endereco, String email, List<Materia> materia) {
        super(nome, idade, rg, endereco);
        this.email = email;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "email='" + email + '\'' +
                ", materia=" + materia +
                "} ";
    }
}
