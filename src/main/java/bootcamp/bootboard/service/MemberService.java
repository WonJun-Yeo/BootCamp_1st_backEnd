package bootcamp.bootboard.service;

import bootcamp.bootboard.domain.Member;
import bootcamp.bootboard.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  // queryAll
  public List<Member> findMembers() {
    return memberRepository.findAll();
  }

  // query
  public Member findMember(Long memberId) {
    return memberRepository.findOne(memberId);
  }

  // join
  @Transactional
  public Long join(Member member) {
    //
    validateDuplicateMemberId(member);
    return memberRepository.save(member);
  }

  // duplicate validation id
  // TODO: 앞 단에서 중복확인 하는 API 로 대체 후 삭제
  private void validateDuplicateMemberId(Member member) {
    List<Member> findMembers = memberRepository.findById(member.getId());
    if (!findMembers.isEmpty()) {
      throw new IllegalStateException("This ID already exists");
    }
  }

}
