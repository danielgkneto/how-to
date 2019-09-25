package com.danielgkneto.mcjavabc.howto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/howto-tie-a-tie")
    public String howToTieATie() {
        return "howto-tie-a-tie";
    }
    @RequestMapping("/howto-caipirinha")
    public String howToCaipirinha() {
        return "howto-caipirinha";
    }

    @RequestMapping("/howto3")
    public String howTo3() {
        return "howto3";
    }
}
