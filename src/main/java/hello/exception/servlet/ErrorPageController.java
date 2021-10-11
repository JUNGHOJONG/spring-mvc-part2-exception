package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ErrorPageController {

    @GetMapping("/error-page/404")
    public String errorPage404() {
        log.info("error page 404");
        return "/error-page/404";
    }

    @GetMapping("/error-page/500")
    public String errorPage500() {
        log.info("error page 500");
        return "/error-page/500";
    }
}