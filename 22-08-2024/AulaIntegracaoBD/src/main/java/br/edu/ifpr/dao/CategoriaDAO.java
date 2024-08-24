/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.dao;

import br.edu.ifpr.bean.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class CategoriaDAO implements Dao<Integer, Categoria> {

    protected Connection con;

    public CategoriaDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void create(Categoria entity) {
        String sql = "INSERT INTO Categoria (descricao) VALUES (?);";
        try {

            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getDescricao());
            query.executeUpdate();
            
            ResultSet rs = query.getGeneratedKeys();
            
            if(rs.next()){
         // pega o id gerado pelo bd para a nova categoria gravada               
            int id = rs.getInt(1);
            entity.setId(id);
            
            }
            query.close();
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Categoria retrieve(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Categoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
