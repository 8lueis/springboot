package khk.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 모든 프로젝트에는 메인 클래스가 필요
// 자바의 main() 메서드와 같은 역할 == 스프링 부트가 시작되는 부분
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args){
        // .run() 애플리케이션 실행
        // 첫 번째 인수: 메인 클래스로 사용할 클래스
        // 두 번째 인수: 커맨드 라인의 인수들을 전달
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}

