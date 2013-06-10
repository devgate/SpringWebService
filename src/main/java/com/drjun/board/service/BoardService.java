package com.drjun.board.service;

import com.drjun.board.model.Board;
import com.drjun.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 6. 7.
 * Time: 오후 5:47
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

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
