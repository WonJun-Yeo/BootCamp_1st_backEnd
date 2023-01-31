package bootcamp.bootboard.service;

import bootcamp.bootboard.domain.board.Board;
import bootcamp.bootboard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {
  private final BoardRepository boardRepository;

  @Transactional
  public void save(Board board) {
    boardRepository.save(board);
  }

  public List<Board> findBoards() {
    return boardRepository.findAll();
  }

  public Board findBoard(Long boardId) {
    return boardRepository.findOne(boardId);
  }
}
