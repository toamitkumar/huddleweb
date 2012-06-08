package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.ThemeService;

@Controller
public class ThemeController {
	
	@Autowired
    private ThemeService themeService;
	
	@RequestMapping("/")
    public String index(Map<String, Object> map) {
        map.put("themeList", themeService.allThemes());
        return "themes";
    }
	
}
