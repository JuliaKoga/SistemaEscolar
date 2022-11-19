public class Aluno extends Pessoa implements Cadastravel{

    private Classe classe;

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Aluno(String nome, int idade, String rg, Endereco endereco, Classe classe) {
        super(nome, idade, rg, endereco);
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                "classe=" + classe +
                "} ";
    }
}
