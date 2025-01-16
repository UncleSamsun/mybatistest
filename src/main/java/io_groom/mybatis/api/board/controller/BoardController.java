package io_groom.mybatis.api.board.controller;

import io_groom.mybatis.api.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public String index() {
        return "board/index";
    }

    @GetMapping("/boards")
    public String list(Model model) {
        model.addAttribute("posts", boardService.getBoards());
        return "board/list";
    }

    @GetMapping("/boards/create")
    public String create() {
        return "board/create";
    }
}
