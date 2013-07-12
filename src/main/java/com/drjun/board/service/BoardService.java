package com.drjun.board.service;

import com.drjun.board.model.Board;
import com.drjun.board.repository.BoardRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: dr.jun
 */
@Service
public class BoardService {

    @Autowired
    BoardRepositoryImpl boardRepository;

    public List<Board> getBoardList(){
        return boardRepository.getBoardList();
    }

    public void addComments(Board board) {
        boardRepository.add(board);
    }

    public void deleleComments(int id) {
        boardRepository.delete(id);
    }
}
