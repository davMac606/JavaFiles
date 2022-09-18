/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.JogoDAO;
import model.Jogo;

/**
 *
 * @author aluno
 */
public class JogoController {
    private ArrayList<Jogo> listaJo;
    
    
public JogoController() {
        listaJo = new ArrayList<>();
    }    


 public void cadastrar (String nome, String genero, int pg, String dev) {
        Jogo jo1 = new Jogo (nome, genero, pg, dev);
        //listaAl.add(al);
        JogoDAO jodao = new JogoDAO();
        try {
        jodao.inserirJogo(jo1);
        } catch (SQLException ex) {

        }
    }
 
 public ArrayList<Jogo> busca () throws SQLException {
     JogoDAO joDAO = new JogoDAO();
     return (joDAO.buscaJogos());
}
public ArrayList<Jogo> buscaJogo() throws SQLException {
    JogoDAO joDAO = new JogoDAO();
    return (joDAO.buscaPorNome());
}
 public void excluirJogo(String nome) throws SQLException {
     JogoDAO joDAO = new JogoDAO();
     joDAO.excluir(nome);
 }
}


 
