package Model;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

public class connect {

    public Connection connect() throws SQLServerException {
        String serverName = "DESKTOP-ATI6PBQ"; 
        String database = "computermanagement"; 
        String user = "sa";
        String pass = "123"; 
        int port = 1433; 

        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pass);
        dataSource.setDatabaseName(database);
        dataSource.setServerName(serverName);
        dataSource.setPortNumber(port);
        dataSource.setTrustServerCertificate(true);

        return dataSource.getConnection();
    }
}
