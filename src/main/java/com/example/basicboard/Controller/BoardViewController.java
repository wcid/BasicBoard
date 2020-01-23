package com.example.basicboard.Controller;

import com.example.basicboard.Entity.Board;
import com.example.basicboard.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardViewController {

    private final BoardService boardService;

    @Autowired
    public BoardViewController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @GetMapping("/board/create")
    public ModelAndView createBoard() {
        ModelAndView nextView = new ModelAndView("/board/create");
        return nextView;
    }


    @PostMapping("/board/create")
    public ModelAndView CreateBoard(Board board) {
        boardService.insert(board);
        var list = boardService.findAll();

        ModelAndView nextView = new ModelAndView("/board/list");
        nextView.addObject("boardList", list);
        return nextView;
    }

    @GetMapping("/board")
    public ModelAndView list() {
        var list = boardService.findAll();

        ModelAndView nextView = new ModelAndView("/board/list");
        nextView.addObject("boardList", list);
        return nextView;
    }

    @GetMapping("/board/{id}")
    public ModelAndView readBoard(@PathVariable int id) {
        var board = boardService.findById(id);

        ModelAndView nextView = new ModelAndView("/board/read");
        nextView.addObject("board", board);
        return nextView;
    }

    @GetMapping("/board/update/{id}")
    public ModelAndView updateBoard(@PathVariable int id) {
        var board = boardService.findById(id);

        ModelAndView nextView = new ModelAndView("/board/update");
        nextView.addObject("board", board);
        return nextView;
    }

    @PostMapping("/board/update/{id}")
    public ModelAndView updateBoard(@PathVariable int id, Board board) {
        boardService.update(id, board);
        var Board = boardService.findById(id);

        ModelAndView nextView = new ModelAndView("/board/read");
        nextView.addObject("board", board);
        return nextView;
    }

    @GetMapping("/board/delete/{id}")
    public ModelAndView deleteBoard(@PathVariable int id) {
        boardService.delete(id);
        var list = boardService.findAll();

        ModelAndView nextView = new ModelAndView("/board/list");
        nextView.addObject("boardList", list);
        return nextView;
    }
}
