
package br.uva.sga.modelo;

public class Ocorrencia {

    private int id_ocorrencia;

    private Viagem id_Viagem;
    
    private String descricao;
    private String diaHora;
    private String reclamacaoDoUsuario;

    public Ocorrencia() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiaHora() {
        return diaHora;
    }

    public void setDiaHora(String diaHora) {
        this.diaHora = diaHora;
    }

    public String getReclamacaoDoUsuario() {
        return reclamacaoDoUsuario;
    }

    public void setReclamacaoDoUsuario(String reclamacaoDoUsuario) {
        this.reclamacaoDoUsuario = reclamacaoDoUsuario;
    }

    public int getId_ocorrencia() {
        return id_ocorrencia;
    }

    public void setId_ocorrencia(int id_ocorrencia) {
        this.id_ocorrencia = id_ocorrencia;
    }

    public Viagem getId_Viagem() {
        return id_Viagem;
    }

    public void setId_Viagem(Viagem id_Viagem) {
        this.id_Viagem = id_Viagem;
    }
}
