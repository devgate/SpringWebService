package com.drjun.board.repository;

import com.drjun.board.model.Board;

import java.util.List;

/**
 * User: dr.jun
 */
public interface BoardRepository {

    public List<Board> getBoardList();
    public void add(Board board);
    public void delete(int i);

}
