package bootcamp.bootboard.domain.board;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Qna")
public class Qna extends Board {
  private String answer;

  private Long respondentId;
}
