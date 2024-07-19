import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso_java = new Curso();
        curso_java.setTitulo("Curso Java");
        curso_java.setDescricao("Curso básico de java para iniciantes.");
        curso_java.setCargaHoraria(20);

        Curso curso_kotlin = new Curso();
        curso_kotlin.setTitulo("Curso Kotlin");
        curso_kotlin.setDescricao("Curso intermediário de Kotlin.");
        curso_kotlin.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de C#");
        mentoria.setDescricao("Mentoria de c# para aperfeiçoar códigos.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Santander Java Developer");
        bootcamp.getConteudos().add(curso_java);
        bootcamp.getConteudos().add(curso_kotlin);
        bootcamp.getConteudos().add(mentoria);

        Dev devBeatriz = new Dev();
        devBeatriz.setNome("Camila");
        devBeatriz.inscreverBootcamp(bootcamp);
        imprimeConteudosInscritos(devBeatriz);
        devBeatriz.progredir();
        devBeatriz.progredir();
        System.out.println("-");
        imprimeConteudosInscritos(devBeatriz);
        imprimeConteudosConcluidos(devBeatriz);
        System.out.println("XP adquiridos:" + devBeatriz.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        imprimeConteudosInscritos(devJoao);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        imprimeConteudosInscritos(devJoao);
        imprimeConteudosConcluidos(devJoao);
        System.out.println("XP adquiridos:" + devJoao.calcularTotalXp());

        

    }


    public static void imprimeConteudosInscritos(Dev desenvolvedor){
        System.out.println("Conteúdos inscritos" + desenvolvedor + ":" + desenvolvedor.getConteudosInscritos());
    }

    public static void imprimeConteudosConcluidos(Dev desenvolvedor){
        System.out.println("Conteúdos concluidos por " + desenvolvedor + ":" + desenvolvedor.getConteudosInscritos());
    }
}
