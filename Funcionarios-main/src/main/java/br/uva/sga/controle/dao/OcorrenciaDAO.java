package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.Ocorrencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OcorrenciaDAO {

    public void save(Ocorrencia ocorrencia){
        String sql = "INSERT INTO `ocorrencia`(descricao,reclamacaoDoUsuario,diaHora,id_viagem) VALUES (?,?,?,?)";

        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1 , ocorrencia.getDescricao());
            pstm.setString(2,ocorrencia.getReclamacaoDoUsuario());
            pstm.setString(3,new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance()));
            pstm.setInt(4,ocorrencia.getId_Viagem().getId_viagem());
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

    public Ocorrencia consult(int id_ocorrencia){
        String sql = "SELECT * FROM ocorrencia WHERE id_ocorrencia = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1, id_ocorrencia);
            rs = pstm.executeQuery();
            if(rs.next()){
                ocorrencia.setId_ocorrencia(rs.getInt("id_ocorrencia"));
                ocorrencia.setDescricao(rs.getString("descricao"));
                ocorrencia.setDiaHora(rs.getString("diaHora"));
                ocorrencia.getId_Viagem().setId_viagem(rs.getInt("id_viagem"));
                ocorrencia.setReclamacaoDoUsuario(rs.getString("reclamacaoDoUsuario"));
                return ocorrencia;
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
