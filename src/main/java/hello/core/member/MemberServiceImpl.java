package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //여기서 memberRepository는 MemberService와 MemoryMemberRepository에 의존하고 있다.
    //추상화와 구체화 모두에 의존중



    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
