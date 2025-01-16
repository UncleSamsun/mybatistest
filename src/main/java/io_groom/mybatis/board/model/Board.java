package io_groom.mybatis.board.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {

    private long seq;

    private String title;

    private String contents;

    private String regUser;

    private LocalDateTime regDate;
}
