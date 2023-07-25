import java.sql.*;

public class Main {


    //Criação de banco de dados
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras"
            + "("
            + "Id Int PRIMARY KEY,"
            + " Figura VARCHAR(100) NOT NULL,"
            + " Cor VARCHAR(100) NOT NULL"
            + ")";


    // Inserir dois circulos e três quadrados de diferentes cores
    private static final String sqlInsert1 = "INSET INTO Figuras (Id, Figura, Cor) Values (1,'Circulo', 'Branco')";
    private static final String sqlInsert2 = "INSET INTO Figuras (Id, Figura, Cor) Values (2,'Circulo', 'Preto')";
    private static final String sqlInsert3 = "INSET INTO Figuras (Id, Figura, Cor) Values (3,'Quadrado', 'Branco')";
    private static final String sqlInsert4 = "INSET INTO Figuras (Id, Figura, Cor) Values (4,'Quadrado', 'Preto')";
    private static final String sqlInsert5 = "INSET INTO Figuras (Id, Figura, Cor) Values (5,'Quadrado', 'Azul')";


    //Deletar  private static final String sqlDelete = "DELETE FROM Figuras WHERE Id = 5";


    // Criar Conexão
    public static Connection getConexao() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "BB", "");
    }


    public static void main(String[] args) throws Exception {

        //
        Connection connection = null;
        try {
            connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);
            mostrarFigura(connection);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        private static void mostrarFigura (Connection connection)throw SQLException {
            String sqlQuery = "SELECT * FROM Figuras";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);


        }

    }
}
