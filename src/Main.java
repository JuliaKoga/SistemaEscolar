import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PessoaRepository cadastro = new PessoaRepository();
        Relatorio relatorio = new Relatorio();

        List<Materia> materia = new ArrayList<>();

        Endereco endereco1 = new Endereco("XXX","XXX",123,"XXX","00000-000",Estado.SP,"São Paulo");
        Aluno joao = new Aluno("João",16,"00000000-0",endereco1,Classe.B2);
        Endereco endereco2 = new Endereco("YYY","YYY",234,"YYY","00000-000",Estado.SP,"São Paulo");
        materia.add(Materia.PORTUGUES);
        Professor luana = new Professor("Luana",31, "00000000-0",endereco2,"luana123@hotmail.com",materia);
        Endereco endereco3 = new Endereco("ZZZ","ZZZ",345,"ZZZ","00000-000",Estado.SP,"São Paulo");
        Aluno ana = new Aluno("Ana", 15,"00000000-0", endereco3,Classe.A1);
        Visitante carlos = new Visitante("Carlos",38,"00000000-0",endereco3);
        Endereco endereco4 = new Endereco("AAA","AAA",456,"AAA","00000-000",Estado.SP,"São Paulo");
        List<Materia> materia2 = new ArrayList<>();
        materia2.add(Materia.FILOSOFIA);
        materia2.add(Materia.SOCIOLOGIA);
        Professor jose = new Professor("José",43,"00000000-00",endereco4,"jose123@live.com",materia2);

        cadastro.cadastra(joao);
        cadastro.cadastra(luana);
        cadastro.cadastra(ana);
        cadastro.cadastra(jose);
        cadastro.mostrar();

        relatorio.relatorioUnico(carlos);

    }

}
