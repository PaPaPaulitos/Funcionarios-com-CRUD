
package br.uva.sga.modelo;

public class Onibus {

    private int id_onibus;

    private String placa;
    private String numeracaoRoleta;
    private double quilometragem;

    public Onibus() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getId_onibus() {
        return id_onibus;
    }

    public void setId_onibus(int id_onibus) {
        this.id_onibus = id_onibus;
    }

    public String getNumeracaoRoleta() {
        return numeracaoRoleta;
    }

    public void setNumeracaoRoleta(String numeracaoRoleta) {
        this.numeracaoRoleta = numeracaoRoleta;
    }
}
