import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 전체 테스트를 시작하기 전에 1회 실행하기 때문에 메서드는 static으로 선언
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }
    // ex. 데이터베이스 연결, 테스트 환경 초기화 (실행 주기에서 한 번만 호출되어야)

    @BeforeEach // 테스트 케이스를 시작하기 전마다 실행
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }
    // 객체 초기화, 테스트에 필요한 값을 미리 넣을 때
    // 각 인스턴스에 대해 메서드를 호출해야 하므로 static이면 안 됨

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll // 전체 테스트를 마치고 종료하기 전에 1회 실행하기 때문에 메서드는 static으로 선언
    static void afterAll(){
        System.out.println("@AfterAll");
    }
    // ex. 데이터베이스 연결 종료, 공용으로 사용하는 자원을 해제할 때
    // 실행 주기에 한 번만 호출해야 하므로 static 선언해야 함


    @AfterEach // 테스트 케이스를 종료하기 전마다 실행
    public void afterEach(){
        System.out.println("@AfterEach");
    }
    // ex. 테스트 이후 '특정' 데이터를 삭제해야 하는 경우
    // 각 인스턴스에 대해 메서드를 호출해야 하므로 static이면 안 됨


}
