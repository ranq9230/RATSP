package com.ratsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {
    Map<String, String> data = new HashMap<String, String>();

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

}
