package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.Onibus;
import br.uva.sga.modelo.Viagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OnibusDAO {
    public void save(Onibus onibus){
        String sql = "INSERT INTO onibus(numeroDoOnibus,numeracaoDaRoleta,quilometragem) VALUES (?,?,?)";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1,onibus.getPlaca());
            pstm.setString(2,onibus.getNumeracaoRoleta());
            pstm.setDouble(3,onibus.getQuilometragem());
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

    public Onibus consult(Viagem viagem){
        String sql = "SELECT * FROM onibus WHERE id_onibus = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, viagem.getId_Onibus().getId_onibus());
            rs = pstm.executeQuery();
            if(rs.next()){
                Onibus onibus = new Onibus();
                onibus.setId_onibus(rs.getInt("id_onibus"));
                onibus.setPlaca(rs.getString("numeroDoOnibus"));
                onibus.setNumeracaoRoleta(rs.getString("numeracaoDaRoleta"));
                onibus.setQuilometragem(rs.getDouble("quilometragem"));
                return onibus;
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
