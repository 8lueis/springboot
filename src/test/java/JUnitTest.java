import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// 테스트 코드 작성해 보기 : 작성한 코드가 의도 대로 잘 동작하고,
// 예상치 못한 문제가 없는지 확인하기 위함
// 사용 패턴 : given-when-then

public class JUnitTest {
    @DisplayName("1 + 2는 3이다") // 테스트 이름
    @Test // 테스트 메서드
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;
        Assertions.assertEquals(sum, a + b); // 값이 같은지 확인

        // assertEquals : 검증 메서드 (a + b와 sum의 값이 같은지 확인)
        // 첫 번째 인수: 기대하는 값
        // 두 번째 인수: 검증할 값
    }
}
