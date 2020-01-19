package com.example.basicboard.Controller;

import com.example.basicboard.Entity.Board;
import com.example.basicboard.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardAPIController {
/*
    private static final Logger logger = LoggerFactory.getLogger(BoardAPIController.class);

    private final BoardService boardService;

    @Autowired
    public BoardAPIController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/board")
    public void create(Board board) throws Exception {

    }

    @GetMapping("/board")
    public List<Board> getList() throws Exception {
        return boardService.findAll();
    }

    @GetMapping("/board/{id}")
    public Board readOne(@PathVariable("id") int id) throws Exception {

    }

    @PutMapping("/board/{id}")
    public void modify(Board board) throws Exception {
        .....
    }

    @DeleteMapping("/board/{id}")
    public void delete(@PathVariable("id") int id) throws Exception {

    }

 */
}
