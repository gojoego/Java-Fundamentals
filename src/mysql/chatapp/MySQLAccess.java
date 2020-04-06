package mysql.chatapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;


public class MySQLAccess {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();
        try {
            example.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
    public void readDataBase()
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ChatApp?" +
                            "user=&password=&useSSL=false&allowPublicKeyRetrieval=true");
            // when pushing this file to github, remove username and password
            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from ChatApp.Messages;");
            //writeResultSet(resultSet);
            ArrayList<Message> messages = mapResultSetToObjects(resultSet);
            for (Message m : messages){
                System.out.println(m.toString());
            }

            resultSet = statement.executeQuery("select * from ChatApp.User;");
            //writeResultSet(resultSet);
            ArrayList<Users> users = mapUsersResultSetToObjects(resultSet);
            for (Users u : users){
                System.out.println(u.toString());
            }
            // PreparedStatements can use variables and are more efficient
            /*PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into  chat_app.Messages (sender_id, recipient_id, content) " +
                            "values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1,1 );
            preparedStatement.setInt(2, 2);
            preparedStatement.setString(3, "Delete * from users;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("SELECT * from chat_app.Messages");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);
            //Remove again the insert comment
            preparedStatement = connection
                    .prepareStatement("delete from chat_app.Messages where id = ? ; ");
            preparedStatement.setInt(1, 4);
            preparedStatement.executeUpdate();
            resultSet = statement.executeQuery("select * from chat_app.Messages");
            writeMetaData(resultSet);*/
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            close();
        }
    }

    private ArrayList<Users> mapUsersResultSetToObjects(ResultSet resultSet) throws SQLException {

        // what happens when we use @Mapper and @Select tag in mybatis
        ArrayList<Users> userList = new ArrayList();
        while (resultSet.next()) {

            Users u = new Users();

            u.setId(resultSet.getInt("id"));
            u.setF_name(resultSet.getString("f_name"));
            u.setL_name(resultSet.getString("l_name"));
            u.setEmail(resultSet.getString("email"));
            u.setUsername(resultSet.getString("username"));
            u.setProfile_pic_id(resultSet.getInt("profile_pic_id"));
            u.setStatus(resultSet.getInt("status"));
            userList.add(u);
        }
        return userList;

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //         Now get some metadata from the database
        // Result set get the result of the SQL query
        System.out.println("The columns in the table are: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            int sender_id = resultSet.getInt("sender_id");
            int recipient_id = resultSet.getInt("recipient_id");
            String message = resultSet.getString("content");
            System.out.println("Sender: " + sender_id + ", Recipient: " + recipient_id + ", Content: " + message);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
        }
    }
    private ArrayList<Message> mapResultSetToObjects(ResultSet resultSet) throws SQLException {
        ArrayList<Message> retList = new ArrayList();
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Message m = new Message();
            m.setId(resultSet.getInt("id"));
            m.setSender_id(resultSet.getInt("sender_id"));
            m.setRecipient_id(resultSet.getInt("recipient_id"));
            m.setContent(resultSet.getString("content"));
            m.setTimestamp(resultSet.getTime("timestamp").toString());
            retList.add(m);
        }
        return retList;
    }
    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        }
    }
}