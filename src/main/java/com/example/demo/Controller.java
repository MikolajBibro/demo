package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private final List<String> list = new ArrayList<>();

    @ResponseBody
    @GetMapping("/save")
    public String save(@RequestParam(name = "name", required = true) String name, Model model) {
        list.add(name);
        return "saved";
    }

    @GetMapping("/get")
    public String get(@RequestParam(name = "name", required = true) Integer param, Model model) {
        model.addAttribute("name", list.get(param));
        return "greeting";
    }

}
