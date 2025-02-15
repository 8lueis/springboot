package khk.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 비즈니스 계층 == 서비스
@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository; // 빈 주입

    public List<Member> getAllMembers(){
        return memberRepository.findAll(); // 멤버 목록 얻기

    }
}
// MemberRepository라는 빈을 주입 받은 후에 findAll() 메서드를 호출
// ==> 멤버 테이블에 저장된 멤버 목록을 모두 가져옴