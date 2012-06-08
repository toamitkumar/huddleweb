package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Response;
import com.example.model.Theme;
import com.example.service.ThemeService;
import com.example.utility.RandomGenerator;


@Controller
public class QuestionController {
	
	@Autowired
    private ThemeService themeService;
	
	@RequestMapping(value = "/question")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		int themeInt = Integer.parseInt(request.getParameter("theme"));
		Theme theme = themeService.getThemeById(themeInt);
		
		int firstRandom = RandomGenerator.generate(19, 10);
		int secondRandom = RandomGenerator.generate(19, 10);
		
		while(firstRandom == secondRandom) {
			secondRandom = RandomGenerator.generate(19, 10);
		}
		
		ModelAndView mv = new ModelAndView("question", "theme", theme);
		
        return mv;
    }
}
