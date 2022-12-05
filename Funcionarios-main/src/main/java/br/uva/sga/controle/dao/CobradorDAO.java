package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;


public class CobradorDAO {

    /*
     * Data Acess Object = DAO
     *
     * Realiza o CRUD de uma classe/tabela do banco de dados
     *
     *  C = CREATE Feito
     *  R = READ Feito
     *  U = UPDATE Feito
     *  D = DELETE Falta
     */

    public void save(int id_pessoa){
        String sql = "INSERT INTO cobrador(id_pessoa) VALUES (?)";
        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1,id_pessoa);
            pstm.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //Fechando conexões abertas
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(coon != null){
                    coon.close();
                }
            }catch (Exception e){
                e.printStackTrace();

            }

        }

    }

    public Cobrador consult(int id_pessoa){
        String sql = "SELECT * FROM cobrador WHERE id_pessoa = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Cobrador cobrador = new Cobrador();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_pessoa);
            rs = pstm.executeQuery();
            if(rs.next()){
                cobrador.setId_pessoa(rs.getInt("id_pessoa"));
                return cobrador;
            }else{
                return null;
            }

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //Fechando conexões abertas
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(coon != null){
                    coon.close();
                }
            }catch (Exception e){
                e.printStackTrace();

            }
        }

    }
}
