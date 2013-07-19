package com.drjun.board.service;

import com.drjun.board.model.Board;
import com.drjun.board.repository.BoardRepositoryMemoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: dr.jun
 */
@Service
public class BoardService {

    @Autowired
    BoardRepositoryMemoryImpl boardRepositoryMemory;
    //BoardRepositoryMysqlImpl boardRepositoryMysql;

    public List<Board> getBoardList(){
        return boardRepositoryMemory.getBoardList();
    }

    public void addComments(Board board) {
        boardRepositoryMemory.add(board);
    }

    public void deleleComments(int id) {
        boardRepositoryMemory.delete(id);
    }
}
