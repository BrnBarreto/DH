package com.dh.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDrive;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC() {
        this.jdbcDrive = "org.h2.com.Driver";
        this.dbUrl = "jdbc:h2:~/medicamentos; INIT=RUNSCRIPT FROM 'create.sql' ";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conecatarComBancoDeDados() throws SQLException {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbUrl,nomeUsuario,senha);
        }catch (SQLDataException e){
            e.printStackTrace();
        }
        return connection;
    }
}
