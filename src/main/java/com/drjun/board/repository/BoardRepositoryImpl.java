package com.drjun.board.repository;

import com.drjun.board.model.Board;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 12.
 * Time: 오후 11:02
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class BoardRepositoryImpl implements BoardRepository{
    private static int boardId = 1;

    private List<Board> boardList = new ArrayList<Board>();

    public BoardRepositoryImpl() {
        Board board = new Board("title", "writer", "pw", "content");
        Board board2 = new Board("title2", "writer2", "pw2", "content2");

        boardList.add(board);
        boardList.add(board2);
    }

    public List<Board> getBoardList(){
        return boardList;
    }

    public void add(Board board){
        boardList.add(board);
    }

    public void delete(int id) {
        for( Board board: boardList){
            if(board.getId() == id){
                boardList.remove(board);
                break;
            }
        }
    }
}
