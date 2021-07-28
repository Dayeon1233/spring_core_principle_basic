package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //여기서 memberRepository는 MemberService와 MemoryMemberRepository에 의존하고 있다.
    //추상화와 구체화 모두에 의존중

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
