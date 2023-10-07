package dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Bilhete {
    private int id;
    private int numero;
    private String assento;
    private LocalDate dataPartida;
    private LocalDate dataChegada;
    private String tipo;

    public Bilhete(){

    }
    public Bilhete(int id, int numero, String assento, LocalDate dataPartida, LocalDate dataChegada, String tipo) {
        this.id = id;
        this.numero = numero;
        this.assento = assento;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bilhete bilhete = (Bilhete) o;
        return id == bilhete.id && numero == bilhete.numero && Objects.equals(assento, bilhete.assento) && Objects.equals(dataPartida, bilhete.dataPartida) && Objects.equals(dataChegada, bilhete.dataChegada) && Objects.equals(tipo, bilhete.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, assento, dataPartida, dataChegada, tipo);
    }

    @Override
    public String toString() {
        return "Bilhete{" +
                "id=" + id +
                ", numero=" + numero +
                ", assento='" + assento + '\'' +
                ", dataPartida=" + dataPartida +
                ", dataChegada=" + dataChegada +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
