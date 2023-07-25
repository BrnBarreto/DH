import java.sql.*;

public class Main {


    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Animal; CREATE TABLE Animal"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Tipo VARCHAR(100) NOT NULL"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (1, 'Pingo', 'Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (2, 'Lua', 'Cachorro')";
    private static final String sqlInsert3 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (3, 'Mimi', 'Gato')";
    private static final String sqlInsert4 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (4, 'Pe de Pano', 'Cavalo')";
    private static final String sqlInsert5 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (5, 'Pi', 'Piriquito')";

    private static final String sqlDelete = "DELETE FROM Animal WHERE Id = 2";

    public static void main(String[] args) {

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

            mostraAnimal(connection);

            statement.execute(sqlDelete);

            mostraAnimal(connection);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostraAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Animal";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2)  + " - " + resultSet.getString(3));
        }
    }

    public static Connection getConexao() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}