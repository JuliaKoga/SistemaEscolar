import java.time.LocalTime;

public class HorarioDeEntrada {

    public void atraso(Aluno aluno, LocalTime chegada){
        if (chegada.getHour()<8){
            System.out.println("Aluno(a) "+aluno.getNome()+" chegou antes da aula começar");
        } else if (chegada.getHour()==8 && chegada.getMinute()<=10) {
            System.out.println("Aluno(a) "+aluno.getNome()+" quase perdeu a aula");
        }else {
            System.out.println("Aluno(a) "+aluno.getNome()+" passou dos 10 minutos de tolerância, não participará da aula");
        }
    }
}
