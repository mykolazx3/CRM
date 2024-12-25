package com.mykola.crm.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "forward:/index.html"; //тільки так заканало. index або index.html не канає
    }
}