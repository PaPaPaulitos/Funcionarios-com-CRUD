package br.uva.sga.visao;

import java.awt.Color;
import javax.swing.*;

import br.uva.sga.modelo.Pessoa;

public class Configuracoes {
    private LoginFiscal login_fiscal = new LoginFiscal();
    private LancamentoFiscalFinal lancamento_fiscal_final = new LancamentoFiscalFinal();
    private LancamentoFiscalInicial lancamento_fiscal_inicial = new LancamentoFiscalInicial();
    private Reclamacao reclamacao = new Reclamacao();
    private OnibusChegando onibus_chegando = new OnibusChegando();
    private Menu menu = new Menu();
    private Registro registro = new Registro();

    private AtualizarDados atualizarDados = new AtualizarDados();

    private TelaInicial telaInicial = new TelaInicial();



    public Configuracoes() {
    }


    public void telaInicial(){
        Pessoa pessoa = new Pessoa();
        getTelaInicial().setVisible(true);
        getTelaInicial().setSize(400,350);
        getTelaInicial().getContentPane().setBackground(Color.decode("#27E3CA"));
        getTelaInicial().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getTelaInicial().logar();
        getTelaInicial().registrar(pessoa);

    }

    public void telaLogin(){
        getLogin_fiscal().setVisible(true);
        getLogin_fiscal().setSize(400,350);
        getLogin_fiscal().getContentPane().setBackground(Color.decode("#27E3CA"));
        getLogin_fiscal().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void telaLancamentoFinal(Pessoa pessoa){
        getLancamento_fiscal_final().setVisible(true);
        getLancamento_fiscal_final().setSize(400,350);
        getLancamento_fiscal_final().getContentPane().setBackground(Color.decode("#27E3CA"));
        getLancamento_fiscal_final().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getLancamento_fiscal_final().lancar(pessoa);
    }

    public void telaLancamentoInicio(Pessoa pessoa){
        getLancamento_fiscal_inicial().setVisible(true);
        getLancamento_fiscal_inicial().setSize(400,350);
        getLancamento_fiscal_inicial().getContentPane().setBackground(Color.decode("#27E3CA"));
        getLancamento_fiscal_inicial().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getLancamento_fiscal_inicial().lancamento(pessoa);
    }

    public void telaReclamacao(){
        getReclamacao().setVisible(true);
        getReclamacao().setSize(400,350);
        getReclamacao().getContentPane().setBackground(Color.decode("#27E3CA"));
        getReclamacao().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getReclamacao().lancar();
    }

    public void onibusRodando(Pessoa pessoa){
        getOnibus_chegando().setVisible(true);
        getOnibus_chegando().setSize(400,350);
        getOnibus_chegando().getContentPane().setBackground(Color.decode("#27E3CA"));
        getOnibus_chegando().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getOnibus_chegando().view(pessoa);
    }

    public void menu(Pessoa pessoa){
        getMenu().setVisible(true);
        getMenu().setSize(400,350);
        getMenu().getContentPane().setBackground(Color.decode("#27E3CA"));
        getMenu().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getMenu().view(pessoa);
        getMenu().atualizar(pessoa);
        getMenu().sair();
        getMenu().verificar(pessoa);
        getMenu().lancar(pessoa);
    }

    public void registro(Pessoa pessoa){
        getRegistro().setVisible(true);
        getRegistro().setSize(400,350);
        getRegistro().getContentPane().setBackground(Color.decode("#27E3CA"));
        getRegistro().pack();
        getRegistro().getContentPane();
        getRegistro().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getRegistro().enviarDados(pessoa);
    }

    public void atualizarDados(Pessoa pessoa){
        getAtualizarDados().setVisible(true);
        getAtualizarDados().setSize(400,350);
        getAtualizarDados().getContentPane().setBackground(Color.decode("#27E3CA"));
        getAtualizarDados().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getAtualizarDados().botaoupdate(pessoa);
        getAtualizarDados().botaodelete(pessoa);
    }

    public TelaInicial getTelaInicial() {
        return telaInicial;
    }

    public AtualizarDados getAtualizarDados() {
        return atualizarDados;
    }

    public LoginFiscal getLogin_fiscal() {
        return login_fiscal;
    }


    public LancamentoFiscalFinal getLancamento_fiscal_final() {
        return lancamento_fiscal_final;
    }



    public LancamentoFiscalInicial getLancamento_fiscal_inicial() {
        return lancamento_fiscal_inicial;
    }



    public Reclamacao getReclamacao() {
        return reclamacao;
    }


    public OnibusChegando getOnibus_chegando() {
        return onibus_chegando;
    }



    public Menu getMenu() {
        return menu;
    }

    public Registro getRegistro() {
        return registro;
    }

}
