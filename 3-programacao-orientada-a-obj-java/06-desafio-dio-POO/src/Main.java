import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os conceitos básicos de Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Aprenda os conceitos intermediários de Java");
        curso2.setCargaHoraria(16);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como se dar bem com Java");
        mentoria1.setDescricao("Como se dar bem com Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Como se dar bem com Java");
        mentoria2.setDescricao("Como se dar bem com Java");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer, com os melhores especialistas e com certificado ao final.");
        bootcamp.setDataInicial(LocalDate.now());
        bootcamp.setDataFinal(LocalDate.now().plusDays(45));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devCleiton = new Dev();
        devCleiton.setNome("Cleiton");
        devCleiton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cleiton: " + devCleiton.getConteudosInscritos());
        devCleiton.progredir();
        devCleiton.progredir();
        devCleiton.progredir();
        System.out.println("Conteúdos concluídos Cleiton: " + devCleiton.getConteudosConcluidos());
        System.out.println("XP total Cleiton: " + devCleiton.calcularTotalXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP total Maria: " + devMaria.calcularTotalXp());
    }
}
