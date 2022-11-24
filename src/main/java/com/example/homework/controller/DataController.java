package com.example.homework.controller;

import com.example.homework.model.DataDto;
import com.example.homework.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

    @GetMapping("/new")
    public String addPage(Model model) {
        model.addAttribute("data", new DataDto());
        return "add";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("dataList", dataService.getDataList());
        return "list";
    }

    @RequestMapping(value = "/new", method = {RequestMethod.POST})
    public String postData (DataDto dataDto) {
        System.out.println(dataDto.getWriter());
        System.out.println(dataDto.getTitle());
        System.out.println(dataDto.getContent());
        dataService.saveData(dataDto);
        return "redirect:/";
    }

}
