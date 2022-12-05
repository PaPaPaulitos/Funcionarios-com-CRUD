
package br.uva.sga.modelo;

public class Motorista  extends Pessoa {

    private int id_motorista;
    private String carteiraDeMotorista;
    private String registro; 


    private Onibus id_onibus;

    public Motorista() {

    }

    public int getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(int id_motorista) {
        this.id_motorista = id_motorista;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }


    public Onibus getId_onibus() {
        return id_onibus;
    }

    public void setId_onibus(Onibus id_onibus) {
        this.id_onibus = id_onibus;
    }
}
