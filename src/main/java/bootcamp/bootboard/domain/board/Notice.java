package bootcamp.bootboard.domain.board;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("Notice")
public class Notice extends Board {
  private LocalDateTime startDate;

  private LocalDateTime endDate;
}
