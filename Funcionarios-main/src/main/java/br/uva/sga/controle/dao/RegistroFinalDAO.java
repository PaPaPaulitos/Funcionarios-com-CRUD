package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.RegistroFinal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistroFinalDAO {
    public void save(RegistroFinal registroFinal){
        String sql = "INSERT INTO `registroFinal`(id_fiscalGaragem,id_viagem) VALUES (?,?)";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1,registroFinal.getId_fiscal_de_garagem().getId_fiscal_garagem());
            pstm.setInt(2,registroFinal.getId_viagem().getId_viagem());
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

    public RegistroFinal consult(int id_registroFinal){
        String sql = "SELECT * FROM `registroFinal` WHERE id_registroFinal = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_registroFinal);
            rs = pstm.executeQuery();
            if(rs.next()){
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.getId_viagem().setId_viagem(rs.getInt("id_viagem"));
                registroFinal.getId_fiscal_de_garagem().setId_fiscal_garagem(rs.getInt("id_fiscalGaragem"));
                return registroFinal;
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
