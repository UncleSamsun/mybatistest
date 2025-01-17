package io_groom.mybatis.api.board.controller;

import io_groom.mybatis.api.board.service.BoardService;
import io_groom.mybatis.board.model.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/boards")
    public Board update(@RequestBody Board board) {
        return boardService.updateBoard(board);
    }

    @DeleteMapping("/boards/{seq}")
    public boolean delete(@PathVariable long seq) {
        return boardService.deleteBoard(seq);
    }
}
