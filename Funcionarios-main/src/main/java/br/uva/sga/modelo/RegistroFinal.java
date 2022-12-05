
package br.uva.sga.modelo;

public class RegistroFinal {

    private FiscalGaragem id_fiscal_de_garagem;


    private Viagem id_viagem;

    public RegistroFinal() {
    }

    public FiscalGaragem getId_fiscal_de_garagem() {
        return id_fiscal_de_garagem;
    }

    public void setId_fiscal_de_garagem(FiscalGaragem id_fiscal_de_garagem) {
        this.id_fiscal_de_garagem = id_fiscal_de_garagem;
    }

    public Viagem getId_viagem() {
        return id_viagem;
    }

    public void setId_viagem(Viagem id_viagem) {
        this.id_viagem = id_viagem;
    }
}
