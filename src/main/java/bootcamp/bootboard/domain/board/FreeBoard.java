package bootcamp.bootboard.domain.board;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("FreeBoard")
public class FreeBoard extends Board {
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private FreeBoard parent;

  @OneToMany(mappedBy = "parent")
  private List<FreeBoard> child = new ArrayList<>();
}
