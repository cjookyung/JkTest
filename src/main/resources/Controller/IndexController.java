package Controller;

import org.springframework.stereotype.Controller;

public class IndexController {
    @Controller
    @GetMapping("/")   
    public @ResponseBody String index(){
        return "Hello, jookung~!";
    }
}
