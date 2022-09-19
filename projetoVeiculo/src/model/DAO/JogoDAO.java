/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Jogo;

/**
 *
 * @author aluno
 */
public class JogoDAO {
    Connection con;
    public void inserirJogo(Jogo jo) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "Insert into JogoJava (NOME,GENERO,PG,DESENVOLVEDORA) values (?,?,?,?)";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setString(1, jo.getNome());
        smt.setString(2, jo.getGenero());
        smt.setInt(3, jo.getFaixaEtaria());
        smt.setString(4, jo.getDesenvolvedora());
        smt.execute();
        smt.close();
        con.close();
    }
    public ArrayList<Jogo> buscaJogos() throws SQLException {
    ResultSet rs;
    ArrayList<Jogo> listaJogo = new ArrayList();
    con = new Conexao().getConnection();
    String sql = "SELECT * FROM JogoJava";
    PreparedStatement smt = con.prepareStatement(sql);
    rs = smt.executeQuery();
    while (rs.next()) {
        String nome = rs.getString("NOME");
        String genero = rs.getString("GENERO");
        int pg = rs.getInt("PG");
        String desenvolvedora = rs.getString("DESENVOLVEDORA");
        Jogo jo = new Jogo(nome, genero, pg, desenvolvedora);
        listaJogo.add(jo);
    }
    smt.close();
    con.close();
    return listaJogo;
    }
    
    public ArrayList<Jogo> buscaPorNome(String nomeJogo) throws SQLException {
        ResultSet rs;
        ArrayList<Jogo> listaJogo = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM JogoJava WHERE NOME like ?";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setString(1, nomeJogo);
        rs = smt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("NOME");
            String genero = rs.getString("GENERO");
            int pg = rs.getInt("PG");
            String desenvolvedora = rs.getString("DESENVOLVEDORA");
            Jogo jo = new Jogo(nome, genero, pg, desenvolvedora);
            listaJogo.add(jo);
        }
    smt.close();
    con.close();
    return listaJogo;
    }
    
    
    public ArrayList<Jogo> buscaPG(int pg) throws SQLException {
        ResultSet rs;
        ArrayList<Jogo> listaJogo = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM JogoJava WHERE PG like ?";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setInt(1, pg);
        rs = smt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("NOME");
        String genero = rs.getString("GENERO");
        String desenvolvedora = rs.getString("DESENVOLVEDORA");
        Jogo jo = new Jogo(nome, genero, pg, desenvolvedora);
        listaJogo.add(jo);
        }
        smt.close();
        con.close();
        return listaJogo;
    }
    
    public ArrayList<Jogo> buscaGenero(String genero) throws SQLException {
         ResultSet rs;
        ArrayList<Jogo> listaJogo = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM JogoJava WHERE GENERO like ?";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setString(1, genero);
        rs = smt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("NOME");
        int pg = rs.getInt("PG");
        String desenvolvedora = rs.getString("DESENVOLVEDORA");
        Jogo jo = new Jogo(nome, genero, pg, desenvolvedora);
        listaJogo.add(jo);
        }
        smt.close();
        con.close();
        return listaJogo;
    }
    
    public ArrayList<Jogo> buscaDesenvolvedora(String desenvolvedora) throws SQLException {
         ResultSet rs;
        ArrayList<Jogo> listaJogo = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM JogoJava WHERE DESENVOLVEDORA like ?";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setString(1, desenvolvedora);
        rs = smt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("NOME");
        int pg = rs.getInt("PG");
        String genero = rs.getString("GENERO");
        Jogo jo = new Jogo(nome, genero, pg, desenvolvedora);
        listaJogo.add(jo);
        }
        smt.close();
        con.close();
        return listaJogo;
    }
    
    public void excluir(String nome) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM JogoJava WHERE NOME = ?";
        PreparedStatement smt = con.prepareStatement(sql);
        smt.setString(1, nome);
        smt.execute();
        smt.close();
        con.close();
    }
}
