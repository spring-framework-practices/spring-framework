package com.trl.dao.impls;

import com.trl.dao.interfaces.MP3Dao;
import com.trl.dao.objects.MP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component(value = "pSQLDAO")
public class PSQLDAO implements MP3Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(MP3 mp3) {
        String sql = "insert into mp3 (name, author) VALUES (?, ?)";
        jdbcTemplate.update(sql, mp3.getName(), mp3.getAuthor());
    }

    public void insertWithJDBC(MP3 mp3) {

        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/javabegin_ru_spring_jdbc";
            conn = DriverManager.getConnection(url, "developer", "1,5Lht.nt!o0#");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "insert into mp3 (name, author) VALUES (?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mp3.getName());
            ps.setString(2, mp3.getAuthor());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public void delete(MP3 mp3) {
        // TODO Auto-generated method stub

    }

    @Override
    public MP3 getMP3ByID(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MP3> getMP3ListByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MP3> getMP3ListByAuthor(String author) {
        // TODO Auto-generated method stub
        return null;
    }

}
