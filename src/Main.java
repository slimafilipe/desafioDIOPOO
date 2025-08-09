import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Filipe: " + devFilipe.getConteudosInscritos());
        devFilipe.progredir();
        devFilipe.progredir();
        devFilipe.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos " + devFilipe.getNome() + ":" + devFilipe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devFilipe.getNome() + ":" + devFilipe.getConteudosConcluidos());
        System.out.println("XP: " + devFilipe.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos " + devJoao.getNome() + ":" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devJoao.getNome() + ":" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
