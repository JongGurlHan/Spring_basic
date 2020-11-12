package hello.core.member;

public interface MemberRepository {
    //회원저장
    void save (Member member);

    //아이디로 회원 찾는 기능
    Member findById(Long memberId);
}
