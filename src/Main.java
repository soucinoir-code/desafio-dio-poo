import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos John" + devJohn.getConteudoInscritos());
        devJohn.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos John:" + devJohn.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos John:" + devJohn.getConteudosConcluidos());
        System.out.println("XP:" + devJohn.calcularTotalXp());
        System.out.println("-------");

        Dev devMary = new Dev();
        devMary.setNome("Mary");
        devMary.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mary:" + devMary.getConteudoInscritos());
        devMary.progredir();
        devMary.progredir();
        devMary.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mary:" + devMary.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Mary:" + devMary.getConteudosConcluidos());
        System.out.println("XP:" + devMary.calcularTotalXp());
    }
}
