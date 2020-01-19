package com.example.basicboard.service;

import com.example.basicboard.Entity.Board;

import java.util.List;

public interface BoardService {
    public List<Board> findAll();
    public Board findById(long id);
    public void insert(Board board);
    public void update(Board board);
    public void delete(long id);
}
