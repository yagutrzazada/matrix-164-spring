package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DataBaseConfig {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/student_db";
    private static final String DATABASE_USERNAME = "postgres";
    private static final String PASSWORD = "mysecurepassword";
    @Bean
    public Connection getConnection(){
        try{
            Class.forName("org.postgresql.driver");
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        try{
            return DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
