import java.sql.*;

public class Main {

    private static final String sqlCrateTable = "DROP TABLE IF EXISTS Conta; CREATE TABLE Conta"
            + "("
            + " Id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "Conta VARCHAR(100), NOT NULL,"
            + "Saldo NUMERIC (15, 2) NOT NULL"
            ;
    private static final String sqlInsert = "INSERT INTO Conta (Id, Nome, Conta, Saldo) VALUES (?,?,?,?)";
    private static final String sqlUpdate = "UPDATE Conta SET Saldo = ? WHERE Conta = ?";


    public static void main(String[] args) {

        Conta conta = new Conta("Bruno","12345",10d);

        Connection connection = null;

        try{
             connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(sqlCrateTable);

            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);

            preparedStatement.setLong(1,1);
            preparedStatement.setString(2,conta.getNome());
            preparedStatement.setString(3, conta.getConta());
            preparedStatement.setDouble(4,conta.getSaldo());


            preparedStatement.execute();


            String sql = "SELECT * FROM Conta";
            Statement statement1 = connection.createStatement();
            ResultSet rs =  statement1.executeQuery(sql);

            while (rs.next()) {
                System.out.println (rs.getInt(1)+ " "+ rs.getString(2)+ " "
                        + rs.getString(3)+ " "+ rs.getDouble(4));
            }


        } catch(Exception e){


        }finally {

        }


    }

    private static Connection getConnection() throws Exception  {
        Class.forName("org.h2.Driver").newInstance();

        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}