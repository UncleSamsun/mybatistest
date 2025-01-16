package io_groom.mybatis.api.board.controller;

import io_groom.mybatis.api.board.service.BoardService;
import io_groom.mybatis.board.model.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/boards")
    public List<Board> list() {
        List<Board> list = boardService.getBoards();

        log.debug("list size: {}", list.size());
        log.debug("test ");
        return list;
    }
}
