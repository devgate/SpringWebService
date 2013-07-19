package com.drjun.board.repository;

import com.drjun.board.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 14.
 * Time: 오후 4:47
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Qualifier("hsql")
public class BoardRepositoryHsqlImpl implements BoardRepository{

    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String query = "Create Table if not exists "+
                "Boards (ID integer IDENTITY, WRITER varchar(20), PASSWORD varchar(20), TITLE varchar(256), CONTENT varchar(1024))";
        jdbcTemplate.execute(query);
    }

    final static int COL_ID = 1;
    final static int COL_WRITER = 2;
    final static int COL_PASSWORD = 3;
    final static int COL_TITLE = 4;
    final static int COL_CONTENT = 5;

    @Override
    public List<Board> getBoardList() {
        List<Map<String, Object>> entries = jdbcTemplate.queryForList("select * from boards");
        List<Board> boards = new ArrayList<Board>();

        for (Map<String, Object> entry : entries ) {
            Board board = new Board();
            board.setId((Integer)entry.get("id"));
            board.setWriter((String)entry.get("writer"));
            board.setPw((String)entry.get("password"));
            board.setTitle((String)entry.get("title"));
            board.setContent((String)entry.get("content"));

            boards.add(board);
        }

        return boards;
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
