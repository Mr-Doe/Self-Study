package mrdoe.spring.service;

import mrdoe.spring.domain.Member;
import mrdoe.spring.repository.MemberRepository;
import mrdoe.spring.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원 가입
     */
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();

    }

}
