
package br.uva.sga.modelo;


public class Viagem {

    private int id_viagem;
   
    private Fiscal id_Fiscal;
    private Onibus id_Onibus;
    private Cobrador id_Cobrador;
    private Motorista id_Motorista;
    private String horaDeChegada;
    private String horaSaida;


    public Viagem() {
    }

    public Fiscal getId_Fiscal() {
        return id_Fiscal;
    }

    public void setId_Fiscal(Fiscal id_Fiscal) {
        this.id_Fiscal = id_Fiscal;
    }

    public Onibus getId_Onibus() {
        return id_Onibus;
    }

    public void setId_Onibus(Onibus id_Onibus) {
        this.id_Onibus = id_Onibus;
    }

    public Cobrador getId_Cobrador() {
        return id_Cobrador;
    }

    public void setId_Cobrador(Cobrador id_Cobrador) {
        this.id_Cobrador = id_Cobrador;
    }

    public Motorista getId_Motorista() {
        return id_Motorista;
    }

    public void setId_Motorista(Motorista id_Motorista) {
        this.id_Motorista = id_Motorista;
    }

    public int getId_viagem() {
        return id_viagem;
    }

    public void setId_viagem(int id_viagem) {
        this.id_viagem = id_viagem;
    }

    public String getHoraDeChegada() {
        return horaDeChegada;
    }

    public void setHoraDeChegada(String horaDeChegada) {
        this.horaDeChegada = horaDeChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

}
