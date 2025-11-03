import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java Básico", "Aprendendo o básico de Java", 8);
        Curso curso2 = new Curso("POO com Java", "Entendendo orientação a objetos", 12);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Tira dúvidas ao vivo", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Talytta");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("XP " + dev1.getNome() + ": " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("XP " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}
