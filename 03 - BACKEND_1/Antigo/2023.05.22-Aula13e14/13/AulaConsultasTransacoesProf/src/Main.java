import java.sql.*;

public class Main {

    //query para criar nossa tabela no banco de dados
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Conta; CREATE TABLE Conta"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL,"
            + " Conta VARCHAR(100) NOT NULL,"
            + " Saldo NUMERIC (15, 2) NOT NULL"
            + ")";

    // Instruções para inserir dados na tabela Conta
    private static final String sqlInsert = "INSERT INTO Conta (Id, Nome, Conta, Saldo) VALUES (?, ?, ?,?)";
    // Instruções para atualizar saldo na tabela Conta
    private static final String sqlUpdate = "UPDATE Conta SET Saldo = ? WHERE Conta = ?";

    public static void main(String[] args) throws SQLException {

        //instancia de uma nova conta
        Conta conta = new Conta("Gabriel", "123456", 10d);

        //Declarando um atributo connection
        Connection connection = null;

        try {

            //Executa o metodo getConnection para realizar a conexao com o banco de dados
            connection = getConnection();

            //Obj para executar nossa query de criar a tabela
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            //Obj para "Instrucao Preparada"
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            //Preenchendo o parametro de posicao 1, com o valor 1
            preparedStatement.setLong(1, 1);
            //Preenchendo o parametro de posicao 2, com o valor do nome da conta criado no inicio
            preparedStatement.setString(2, conta.getNome());
            //...
            preparedStatement.setString(3, conta.getConta());
            //...
            preparedStatement.setDouble(4, conta.getSaldo());

            //Executando nossa query preparada
            preparedStatement.execute();

            String sql = "SELECT * FROM Conta";

            Statement statement1 = connection.createStatement();
            ResultSet rs = statement1.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)
                        + " " + rs.getString(3) + " " + rs.getDouble(4));
            }

            //desabilitando o auto commit
            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1, conta.depositar(15d));
            psUpdate.setString(2, conta.getConta());
            psUpdate.execute();

            //forcando um erro para que a transacao volte ao seu estado inicial
            //so usado para exemplificar o conceito do commit/rollback
            int a = 4/0;

            //em caso de transacao ok, commit as alteracoes
            connection.commit();

            //reabilitando o autocommit
            connection.setAutoCommit(true);

            statement1 = connection.createStatement();
            rs = statement1.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)
                        + " " + rs.getString(3) + " " + rs.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();

            //voltando ao estado inicial em caso de erro
            connection.rollback();

            String sql = "SELECT * FROM Conta";

            Statement statement1 = connection.createStatement();
            ResultSet rs = statement1.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)
                        + " " + rs.getString(3) + " " + rs.getDouble(4));
            }

        } finally {

            //encerrando a conexao com o banco de dados
            connection.close();
        }

    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}