package bootcamp.bootboard.domain.board;

import bootcamp.bootboard.domain.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

//TODO : Test 완료 후 Setter 삭제

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public class Board {
  @Id @GeneratedValue
  @Column(name = "board_id")
  private Long id;

  private String title;

  private String content;

  @ManyToOne
  @JoinColumn(name = "member_id")
  private Member member;

  @Enumerated(EnumType.STRING)
  private BoardType type;

  private LocalDateTime registrationTime;
}
