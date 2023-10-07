package dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Passageiro {
    private int id;
    private String nome;
    private String email;
    private String documento;

    private List<Bilhete> bilhetes = new LinkedList<>();

    public List<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(List<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }

    public Passageiro(){

    }

    public Passageiro(int id, String nome, String email, String documento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passageiro that = (Passageiro) o;
        return id == that.id && Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(documento, that.documento) && Objects.equals(bilhetes, that.bilhetes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, documento, bilhetes);
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", documento='" + documento + '\'' +
                ", bilhetes=" + bilhetes +
                '}';
    }
}
