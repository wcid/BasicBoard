package com.example.basicboard.service;

import com.example.basicboard.Entity.Board;
import com.example.basicboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Board findById(long id) {
        return boardRepository.findById(id).get();
    }

    @Override
    public void insert(Board board) {
        boardRepository.save(board);
    }

    @Override
    public void update(long id, Board board) {
        boardRepository.findById(id).map((find) -> {
            find.setSubject(board.getSubject());
            find.setContents(board.getContents());
            return boardRepository.save(find);
        }).orElseGet(() -> {
            board.setId(id);
            return boardRepository.save(board);
        });
    }

    @Override
    public void delete(long id) {
        boardRepository.deleteById(id);
    }

}
