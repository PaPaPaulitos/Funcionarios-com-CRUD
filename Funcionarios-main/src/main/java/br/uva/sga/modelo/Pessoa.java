package br.uva.sga.modelo;

public class Pessoa {

    private int id_pessoa;
     private int idade;
     private String nome;
     private String email;
     private String senha;
     private String telefone;
     private String cargo;

    public Pessoa() {

    }

    public void setPessoa(Pessoa pessoa){
        this.id_pessoa = pessoa.getId_pessoa();
        this.idade = pessoa.getIdade();
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.senha = pessoa.getSenha();
        this.telefone = pessoa.getTelefone();
        this.cargo = pessoa.getCargo();
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
