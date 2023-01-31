package bootcamp.bootboard.domain.board;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Faq")
public class Faq extends Board {
  private int likeNum;
  private List<Long> likeMemberIds = new ArrayList<>();

  //TODO: 이미 like 누른 member 인지 validation 후 실행
  public void addLikeNum(Long memberId, int likeNum) {
    this.likeNum += likeNum;
  }
}
