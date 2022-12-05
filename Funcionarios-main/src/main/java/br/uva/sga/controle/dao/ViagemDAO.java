package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.Viagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ViagemDAO {
    public void save(Viagem viagem){
        String sql = "INSERT INTO `viagem`(horarioDeChegada,horarioDeSaida,diaHora,id_onibus,id_motorista,id_cobrador) values (?,?,?,?,?,?);";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1,viagem.getHoraDeChegada());
            pstm.setString(2,viagem.getHoraSaida());
            pstm.setString(3,new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance()));
            pstm.setInt(4,viagem.getId_Onibus().getId_onibus());
            pstm.setInt(5,viagem.getId_Motorista().getId_motorista());
            pstm.setInt(6,viagem.getId_Cobrador().getId_cobrador());
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

    public Viagem consult(int id_viagem){
        String sql = "SELECT * FROM viagem WHERE id_viagem = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Viagem viagem = new Viagem();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_viagem);
            rs = pstm.executeQuery();
            if(rs.next()){
                viagem.setId_viagem(rs.getInt("id_viagem"));
                viagem.setHoraDeChegada(rs.getString("horarioDeChegada"));
                viagem.setHoraSaida(rs.getString("horarioDeSaida"));
                viagem.getId_Onibus().setId_onibus(rs.getInt("id_onibus"));
                viagem.getId_Motorista().setId_motorista(rs.getInt("id_motorista"));
                viagem.getId_Cobrador().setId_cobrador(rs.getInt("id_cobrador"));
                return viagem;
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


    public void updateInicio(Viagem viagem){
        String sql = "UPDATE viagem\n" +
                " horarioDeSaida = ?\n" +
                " WHERE id_viagem = ?";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1, viagem.getHoraSaida());
            pstm.setInt(2, viagem.getId_viagem());
            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();

        }

    }

    public void updateFim(Viagem viagem){
        String sql = "UPDATE viagem\n" +
                " horarioDeChegada = ?\n" +
                " WHERE id_viagem = ?";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1, viagem.getHoraDeChegada());
            pstm.setInt(2, viagem.getId_viagem());
            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
