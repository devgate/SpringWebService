package com.drjun.board.repository;

import com.drjun.board.model.Board;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 11:12
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class BoardRepositoryMysqlImpl implements BoardRepository{

    Connection connection;

    @PostConstruct
    public void init() {

        Connection connection;
        Statement statement;

        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String userId = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection(jdbcUrl, userId, password);
            statement = connection.createStatement();
            //String query = "create table createTest(name varchar(10), tel varchar(15))";
            //statement.execute(query);
            //connection.commit();

            statement.close();
            connection.close();

            System.out.println("정상적으로 연결되었습니다.");
            //initTable();
        } catch (SQLException e) {
            System.out.println("연결 오류");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("연결 오류");
            e.printStackTrace();
        }
    }


    @Override
    public List<Board> getBoardList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(Board board) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
