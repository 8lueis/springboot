package khk.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Hello, world";
    }
}

// 메인 클래스 Xx (메인 클래스를 실행해야 localhost로 접속 가능)
// localhost: 12.0.0.1 == 지금 사용 중인 컴퓨터를 의미
// '/test' : @GetMapping이라는 애너테이션으로 메서드와 매핑할 때 설정한 경로