package khk.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

// 매핑 작업에는 인터페이스가 필요
// 퍼시스턴트 계층 2. DB에 접근할 때 사용할 객체 Member DAO 생성
public interface MemberRepository extends JpaRepository<Member, Long> {
}
