package com.dh.dao.impl;

import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.IDao;
import com.dh.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDao implements IDao <Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger log = Logger.getLogger(String.valueOf(Filial.class));

    public FilialDao(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Filial salvar(Filial filial) {

        log.info("Registrando Filial nova: " + filial.toString());
        Connection connection = configuracaoJDBC.conectarBancoDeDados(;
        Statement statement = null;
        String query = String.format("INSERT INTO paciente (" +
                        "nomeFilial, " +
                        "numero, " +
                        "cidade, " +
                        "estado, " +
                        "ehCincoEstrelas " +
                        ") VALUES ('%s', '%s', '%s', '%s', '%s')",
                filial.getNomeFilial(),
                filial.getNumero(),
                filial.getCidade(),
                filial.getEstado(),
                filial.getEhCincoEstrelas()
        );
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if(generatedKeys.next()) {
                filial.setId(generatedKeys.getInt(1));
                log.info("Filial registrada com sucesso: " + filial.toString());
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return filial;

    }
}
