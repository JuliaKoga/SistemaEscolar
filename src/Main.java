import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PessoaRepository cadastro = new PessoaRepository();
        Relatorio relatorio = new Relatorio();

        List<Materia> materia = new ArrayList<>();

        Endereco endereco1 = new Endereco.EnderecoBuilder()
                .rua("Avenida Paulista")
                .numero(1578)
                .complemento("prédio")
                .cep("01310-200")
                .bairro("Bela Vista")
                .cidade("São Paulo")
                .estado(Estado.SP)
                .criarEndereco();

        Endereco endereco2 = new Endereco.EnderecoBuilder()
                .rua("Avenida Padre Cacique")
                .numero(2000)
                .complemento("prédio")
                .cep("90810-240")
                .bairro("Cristal")
                .cidade("Porto Alegre")
                .estado(Estado.RS)
                .criarEndereco();

        Endereco endereco3 = new Endereco.EnderecoBuilder()
                .rua("Praça Mauá")
                .numero(1)
                .complemento("prédio")
                .cep("20081-240")
                .bairro("Centro")
                .cidade("Rio de Janeiro")
                .estado(Estado.RJ)
                .criarEndereco();

        Endereco endereco4 = new Endereco.EnderecoBuilder()
                .rua("Rua B")
                .numero(20)
                .complemento("prédio")
                .cep("35460-000")
                .bairro("Fazenda Inhotim")
                .cidade("Brumadinho")
                .estado(Estado.MG)
                .criarEndereco();

        Aluno joao = new Aluno("João",16,"00000000-0",endereco1,Classe.B2);
        Aluno ana = new Aluno("Ana", 15,"00000000-0", endereco3,Classe.A1);

        Professor luana = new Professor("Luana",31, "00000000-0",endereco2,"luana123@hotmail.com",materia);
        Professor jose = new Professor("José",43,"00000000-00",endereco4,"jose123@live.com",materia);

        Visitante carlos = new Visitante("Carlos",38,"00000000-0",endereco3);

        materia.add(Materia.PORTUGUES);
        materia.clear();
        materia.add(Materia.FILOSOFIA);
        materia.add(Materia.SOCIOLOGIA);

        cadastro.cadastra(joao);
        cadastro.cadastra(luana);
        cadastro.cadastra(ana);
        cadastro.cadastra(jose);
        cadastro.mostrar();

        relatorio.relatorioUnico(carlos);

    }

}
