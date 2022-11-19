public abstract class Pessoa {

    private String nome;
    private int idade;
    private String rg;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade, String rg, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
