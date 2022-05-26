package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos para Marcelo :" + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos para Marcelo :" + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por Marcelo :" + devMarcelo.getConteudosConcluidos());
        System.out.println("XP:" + devMarcelo.calcularTotalXp());

        System.out.println("-------");
        
        Dev devVasconcelos = new Dev();
        devVasconcelos.setNome("vasconcelos");
        devVasconcelos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos para vasconcelos :" + devVasconcelos.getConteudosInscritos());
        devVasconcelos.progredir();
        devVasconcelos.progredir();
        devVasconcelos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos para Vasconcelos :" + devVasconcelos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos por Vasconcelos :" + devVasconcelos.getConteudosConcluidos());
        System.out.println("XP:" + devVasconcelos.calcularTotalXp());


    }
}
