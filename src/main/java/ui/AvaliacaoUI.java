package ui;

import dominio.Bilhete;
import dominio.Passageiro;

import java.time.LocalDate;

public class AvaliacaoUI {

    private static final Passageiro passageiro = new Passageiro();
    private static final Bilhete bilhete = new Bilhete();

    public static void main(String[] args) {
        passageiro.setId(1);
        passageiro.setNome("Vitor");
        passageiro.setEmail("vitorsaliba@gmail.com");
        passageiro.setDocumento("123.456.789-10");

        bilhete.setId(1);
        bilhete.setNumero(2);
        bilhete.setAssento("3");
        bilhete.setDataPartida(LocalDate.of(2023,10,06));
        bilhete.setDataChegada(LocalDate.of(2023,10,07));
        bilhete.setTipo("Primeira Classe");

        passageiro.getBilhetes().add(bilhete);

        System.out.println(passageiro);
    }

}
