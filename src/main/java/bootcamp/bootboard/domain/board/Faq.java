package bootcamp.bootboard.domain.board;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Faq")
public class Faq extends Board {
  private int likeNum;
}
