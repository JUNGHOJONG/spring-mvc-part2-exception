package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // JSON 변환 시, 프로퍼티 이용하여 객체를 JSON 으로 변환한다. 즉 GETTER 가 필요하다!!
@AllArgsConstructor
public class ErrorResult {

    private String code;
    private String message;
}