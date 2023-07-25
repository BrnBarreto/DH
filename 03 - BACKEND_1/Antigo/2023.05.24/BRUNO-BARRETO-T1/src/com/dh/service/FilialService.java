package com.dh.service;
import com.dh.dao.IDao;
import com.dh.model.Filial;
import java.sql.SQLException;

public class FilialService {

    private IDao<Filial>filialIdao;

    public FilialService(IDao<Filial> filialIdao) {

    }

    public Filial salvarFilial(Filial filial) throws SQLException{
        return filialIdao.salvar(filial);
    }

}
