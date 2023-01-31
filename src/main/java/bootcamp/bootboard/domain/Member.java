package bootcamp.bootboard.domain;

import bootcamp.bootboard.domain.board.Board;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO : Test 완료 후 Setter 삭제

@Entity
@Getter @Setter
public class Member {
  @Id
  @Column(name = "member_id")
  private Long id;

  private String password;

  private String name;

  private String email;

  private String phoneNumber;

  @OneToMany(mappedBy = "member")
  private List<Board> board = new ArrayList<>();

  @Enumerated(EnumType.STRING)
  private Role role;
}
