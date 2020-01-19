package com.example.basicboard;

import com.example.basicboard.Entity.Board;
import com.example.basicboard.repository.BoardRepository;
import com.example.basicboard.service.BoardService;
import com.example.basicboard.service.BoardServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class BasicboardApplicationTests {

    private final BoardService boardService;

    @Autowired
    public BasicboardApplicationTests(BoardService boardService) {
        this.boardService = boardService;
    }

    @Test
    void contextLoads() {

        boardService.insert(Board.builder().subject("dfs").contents("qweqe").writer("wcid").hashedPassword("32342").build());
        var board = boardService.findById(2L);
        board.setContents("updated");
        boardService.update(board);
    }

}
