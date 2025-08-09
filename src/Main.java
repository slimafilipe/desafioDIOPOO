import br.com.dio.desafio.dominio.br.com.dio.desaio.Curso;
import br.com.dio.desafio.dominio.br.com.dio.desaio.Mentoria;

import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }
}
