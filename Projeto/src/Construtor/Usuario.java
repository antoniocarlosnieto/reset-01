package Construtor;

import java.time.LocalDate;

public class Usuario {

    private int id;

    private String nome;

    private String email;

    private LocalDate nascimento;

    private String telefone;

    private String bio;

    private String latitude;

    private String longitude;


    public Usuario(String nome, String email, LocalDate nascimento, String telefone, String bio, String latitude, String longitude) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;

    }


    public int getId() {
        return id;
    }

    public void setId(final int id) {
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nascimento=" + nascimento +
                ", telefone='" + telefone + '\'' +
                ", bio='" + bio + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}

