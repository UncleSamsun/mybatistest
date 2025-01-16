package io_groom.mybatis.mapper;

import io_groom.mybatis.board.model.Board;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {
    List<Board> selectAll();

    Board selectById(@Param("seq") long seq);

    int insert(@Param("Board") Board board);

    int update(@Param("Board") Board board);

    int delete(@Param("seq") long seq);
}
