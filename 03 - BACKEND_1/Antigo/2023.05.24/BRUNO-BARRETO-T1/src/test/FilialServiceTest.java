package test;
import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.impl.FilialDao;
import com.dh.dao.impl.FilialDao;
import com.dh.model.Filial;
import com.dh.service.FilialService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class FilialServiceTest {
    public FilialService filialService = new FilialServiceTest(new FilialDao(new ConfiguracaoJDBC()));


    @Test
    void devesalvarbanco() throws SQLException {
        Filial filial = new Filial("ABC", "09A", "São Paulo", "São Paulo","Sim");
        filialService.salvarFilial(filial);
        Assertions.assertNotNull(filial.getId());
    }

}





