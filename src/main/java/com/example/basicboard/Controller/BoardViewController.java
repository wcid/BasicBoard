package com.example.basicboard.Controller;

import com.example.basicboard.Entity.Board;
import com.example.basicboard.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardViewController {

    private static final Logger logger = LoggerFactory.getLogger(BoardViewController.class);

    private final BoardService boardService;

    @Autowired
    public BoardViewController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("/board")
    public String create() {
        return "/board";
    }

    @GetMapping("/board/list")
    public ModelAndView list() {
        var list = boardService.findAll();
        ModelAndView mv = new ModelAndView("/list");
        mv.addObject("boardList", list);
        return mv;
    }

    @GetMapping("/board/{id}")
    public ModelAndView readBoard(@PathVariable int id) {
        var board = boardService.findById(id);
        ModelAndView mv = new ModelAndView("/board");
        mv.addObject("board", board);
        return mv;
    }

    @PutMapping("/board/{id}")
    public void updateBoard(@PathVariable int id, Board board) {

    }
}
