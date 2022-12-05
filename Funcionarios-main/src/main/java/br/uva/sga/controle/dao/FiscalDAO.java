package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.Fiscal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FiscalDAO {


    public void save(int id_pessoa){
        String sql = "INSERT INTO `fiscal`(id_pessoa) VALUES (?)";

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

    public Fiscal consult(int id_pessoa){
        String sql = "SELECT * FROM fiscal WHERE id_pessoa = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Fiscal fiscal = new Fiscal();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_pessoa);
            rs = pstm.executeQuery();
            if(rs.next()){
                fiscal.setId_pessoa(rs.getInt("id_pessoa"));
                fiscal.setId_fiscal(rs.getInt("id_fiscal"));
                return fiscal;
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
