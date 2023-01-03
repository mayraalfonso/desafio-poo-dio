import br.com.dio.desafio.dominio.*;

import javax.xml.transform.stream.StreamSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMayra = new Dev();
        devMayra.setNome("Mayra");
        devMayra.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Mayra" + devMayra.getConteudosInscritos());

        devMayra.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos de Mayra" + devMayra.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Mayra" + devMayra.getConteudosConcluidos());
        System.out.println("XP:" + devMayra.calcularTotalXp());

        System.out.println("------");

        Dev devEliana = new Dev();
        devEliana.setNome("Eliana");
        devEliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Eliana" + devEliana.getConteudosInscritos());
        devEliana.progredir();
        devEliana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos de Eliana" + devEliana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Eliana" + devEliana.getConteudosConcluidos());
        System.out.println("XP:" + devEliana.calcularTotalXp());

    }
}