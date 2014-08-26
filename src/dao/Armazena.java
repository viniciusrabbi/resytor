/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável pela persistência no banco, utilizando jdbc
 *
 * @author Matheus Claudino
 */
public class Armazena {

    /**
     *
     * Método para a inserção da mensagem no banco
     *
     * @param text mensagem recebida
     * @throws java.sql.SQLException
     */
    public void insert(String text) throws SQLException {
        Connection conexao;
        MySQLNativeDriver driver = new MySQLNativeDriver("BD_resytor", "root", "");
        conexao = driver.obterConexao();

        String sql = "INSERT INTO mensagem(conteudo)VALUES(?);";

        PreparedStatement stmt;

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, text);
            stmt.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("Erro na inserção (" + erro.getLocalizedMessage() + ")");
        }
    }

}
