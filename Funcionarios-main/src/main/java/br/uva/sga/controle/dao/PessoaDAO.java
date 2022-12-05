package br.uva.sga.controle.dao;

import br.uva.sga.controle.connection_factory.ConnectionFactory;
import br.uva.sga.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;


public class PessoaDAO {

    /*
     * Data Acess Object = DAO
     *
     * Realiza o CRUD de uma classe/tabela do banco de dados
     *
     *  C = CREATE Feito
     *  R = READ Feito
     *  U = UPDATE Feito
     *  D = DELETE Feito
     */

    public void save(Pessoa pessoa){
        String sql = "INSERT INTO pessoa(nome,email,senha,telefone,idade,cargo) VALUES (? ,? ,? ,? ,? ,?)";
        Connection coon = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com o MySQL
            coon = ConnectionFactory.createConnectionToMySQL();
            //Criamos uma pstm para executar as Querys
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1,pessoa.getNome());
            pstm.setString(2,pessoa.getEmail());
            pstm.setString(3,pessoa.getSenha());
            pstm.setString(4,pessoa.getTelefone());
            pstm.setInt(5,pessoa.getIdade());
            pstm.setString(6,pessoa.getCargo());
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

    public Pessoa consult(String email){
        String sql = "SELECT * FROM pessoa WHERE email = ?";

        Connection coon = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            Pessoa pessoa = new Pessoa();
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1, email);
            rs = pstm.executeQuery();
            if(rs.next()){
                pessoa.setId_pessoa(rs.getInt("id_pessoa"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setSenha(rs.getString("senha"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setCargo(rs.getString("cargo"));
                return pessoa;
            }else{
                pessoa.setEmail("Nenhum");
                pessoa.setSenha("ERROR");
                return pessoa;
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

    public void update(Pessoa pessoa){
        String sql = "UPDATE pessoa\n" +
                "SET nome = ?,email = ?,senha = ?,telefone = ?,idade = ?,cargo = ?\n" +
                "WHERE id_pessoa = ?";

        Connection coon = null;
        PreparedStatement pstm = null;


        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2,pessoa.getEmail());
            pstm.setString(3,pessoa.getSenha());
            pstm.setString(4,pessoa.getTelefone());
            pstm.setInt(5,pessoa.getIdade());
            pstm.setString(6,pessoa.getCargo());
            pstm.setInt(7,pessoa.getId_pessoa());
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

    public void delete(Pessoa pessoa){
        String sql = "DELETE FROM pessoa WHERE id_pessoa = ?";

        Connection coon = null;
        PreparedStatement pstm = null;


        try{
            coon = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) coon.prepareStatement(sql);
            pstm.setInt(1,pessoa.getId_pessoa());
            pstm.execute();
        }catch (Exception e){
            System.out.println("Não foi possivel remover a pessoa");

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
