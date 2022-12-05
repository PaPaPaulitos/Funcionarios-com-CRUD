package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.Motorista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MotoristaDAO {

    public void save(Motorista motorista){
        String sql = "INSERT INTO motorista(carteiraDeMotorista,registro,id_pessoa,id_onibus) VALUES (?,?,?,?)";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1,motorista.getCarteiraDeMotorista());
            pstm.setString(2,motorista.getRegistro());
            pstm.setInt(3,motorista.getId_pessoa());
            pstm.setInt(4,motorista.getId_onibus().getId_onibus());
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

    public Motorista consult(int id_motorista){
        String sql = "SELECT * FROM motorista WHERE id_motorista = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Motorista motorista = new Motorista();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_motorista);
            rs = pstm.executeQuery();
            if(rs.next()){
                motorista.setId_motorista(rs.getInt("id_motorista"));
                motorista.setCarteiraDeMotorista(rs.getString("carteiraDeMotorista"));
                motorista.setRegistro(rs.getString("registro"));
                motorista.getId_onibus().setId_onibus(rs.getInt("id_onibus"));
                motorista.setId_pessoa(rs.getInt("id_pessoa"));
                return motorista;
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
